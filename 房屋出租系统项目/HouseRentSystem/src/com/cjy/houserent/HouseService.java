package com.cjy.houserent;

import java.util.Arrays;
import java.util.Date;

/**
 * 实现对房屋的各种操作
 * @author cjy
 * @version 1.0
 */
public class HouseService {
    private House[] houseArr;
    Utility utility = new Utility();

    public HouseService() {
        House[] houseArr = new House[2];
        houseArr[0] = new House(1,"俊宇","13207172689","湖北大学",1000,"未出租","2024-3-2 18:32:33");
        houseArr[1] = new House(2,"小米","13307172689","刘家河",1000,"未出租","2024-3-2 18:33:33");
        this.houseArr = houseArr;
    }

    public String list() {
        String houseDetail = "";
        for (int i = 0; i < houseArr.length; i++) {
            if (houseArr[i] == null) {
                continue;
            }
            houseDetail += houseArr[i].getId()+"\t"+houseArr[i].getName()+"\t"
                           +houseArr[i].getNumber()+"\t"+houseArr[i].getAddress()+"\t"
                           +houseArr[i].getRent()+"\t"+houseArr[i].getState()+"\t\t\t"+houseArr[i].getDate() + "\n";
        }
        return houseDetail;
    }

    public boolean add(String name,String number,String address,int rent,String state) {
        int id = houseArr.length+1;
        String date = utility.stdTime(new Date());
        House house = new House(id,name,number,address,rent,state,date);

        House[] houses = new House[houseArr.length + 1];
        for (int i = 0; i < houseArr.length; i++) {
            houses[i] = houseArr[i];
        }
        houses[houseArr.length] = house;
        houseArr = houses;
        return true;
    }

    public boolean del(int id) {
        for (int i = 0; i < houseArr.length; i++) {
            if(houseArr[i].getId() == id) {
                while(true) {
                    System.out.println("确认是否删除（Y/N）：请小心选择");
                    System.out.print("请输入你的选择（Y/N）：");
                    String key = utility.scanner.next();
                    if (key.equals("Y") || key.equals("y")) {

                        houseArr[i] = null;
                        return true;
                    } else if (key.equals("N") || key.equals("n")) {
                        System.out.println("———————————————————————————取消删除———————————————————————————");
                        return false;
                    } else {
                        System.out.println("你的输入有误,请重新输入");
                    }
                }
            }
        }
        System.out.println("———————————————————————————该房屋信息不存在———————————————————————————");
        return false;
    }

    public House findById(int findId) {
        for (int i = 0; i < houseArr.length; i++) {
            if (houseArr[i] == null) {
                continue;
            }
            if(houseArr[i].getId() == findId) {
                return houseArr[i];
            }
        }
        return null;
    }

    public void update(House house) {
        for (int i = 0; i < houseArr.length; i++) {
            if (houseArr[i] == null) {
                continue;
            }
            if(houseArr[i].getId() ==  house.getId()) {
                houseArr[i] = house;
            }
        }
    }



}
