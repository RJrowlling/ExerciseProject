package com.cjy.houserent;

import java.util.Date;


/**
 * 调用HouseService完成各种操作
 * @author cjy
 * @version 1.0
 */
public class HouseView {
    HouseService houseService;
    Utility utility = new Utility();

    public void mainMenu() {
        do {
            System.out.println("————————————————————————————房屋出租系统————————————————————————————");
            System.out.println("                            1 新 增 房 源");
            System.out.println("                            2 查 找 房 源");
            System.out.println("                            3 删 除 房 源");
            System.out.println("                            4 修 改 房 源 信 息");
            System.out.println("                            5 房 屋 列 表");
            System.out.println("                            6 退      出");
            System.out.print("请选择（1-6）：");
            int key = utility.scanner.nextInt();
            switch (key) {
                case 1:
                    addHouse();
                    break;
                case 2:
                    findHouse();
                    break;
                case 3:
                    delHouse();
                    break;
                case 4:
                    updateHouse();
                    break;
                case 5:
                    listHouse();
                    break;
                case 6:
                    System.out.println("——————————————————————————房屋出租系统已退出——————————————————————————");
                    return;
                default:
                    System.out.println("你的输入有误，请重新输入");
            }


        } while (true);
    }

    public HouseView() {
        this.houseService = new HouseService();
    }

    public void listHouse() {
        System.out.println("————————————————————————————房屋列表————————————————————————————");
        System.out.println("编号\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租、已出租）\t创建时间");
        String houseDetail = houseService.list();
        System.out.println(houseDetail);
    }
    public void addHouse() {
        System.out.println("———————————————————————————添加房屋———————————————————————————");
        System.out.print("姓名：");
        String name = utility.scanner.next();
        System.out.print("电话：");
        String number = utility.scanner.next();
        System.out.print("地址：");
        String address = utility.scanner.next();
        System.out.print("月租：");
        int rent = utility.scanner.nextInt();
        System.out.print("状态（未出租、已出租）：");
        String state = utility.scanner.next();

        houseService.add(name,number,address,rent,state);
        System.out.println("———————————————————————————添加完成———————————————————————————");
    }
    public void delHouse() {
        System.out.println("———————————————————————————删除房屋———————————————————————————");
        while(true) {
            System.out.print("请选择待删除房屋编号（-1退出）：");
            int id = utility.scanner.nextInt();
            if (id == -1) {
                System.out.println("———————————————————————————退出删除———————————————————————————");
                return;
            }
            boolean delKey = houseService.del(id);
            if (delKey) {
                System.out.println("———————————————————————————删除完成———————————————————————————");
                return;
            }
        }
    }

    public void findHouse() {
        System.out.println("———————————————————————————查找房屋———————————————————————————");
        System.out.print("请输入你要查找的id：");
        int id = utility.scanner.nextInt();
        House house = houseService.findById(id);
        if (house == null) {
            System.out.println("———————————————————————————您要查找的房子不存在———————————————————————————");
            return;
        }
        String houseDetail = house.getId()+"\t"+house.getName()+"\t"
                            +house.getNumber()+"\t"+house.getAddress()+"\t"
                            +house.getRent()+"\t"+house.getState()+"\t\t\t"+house.getDate();
        System.out.println(houseDetail);


    }
    public void updateHouse() {
        System.out.println("———————————————————————————修改房屋———————————————————————————");

        while(true) {
            System.out.print("请输入待修改的房屋标号id（-1退出）：");
            int id = utility.scanner.nextInt();
            if (id == -1) {
                return;
            }

            House house = houseService.findById(id);
            if (house == null) {
                System.out.println("———————————————————————————您要修改的房子不存在———————————————————————————");
                continue;
            }
            System.out.print("姓名（"+house.getName()+"）：");
            house.setName(utility.scanner.next());
            System.out.print("电话（"+house.getNumber()+"）：");
            house.setNumber(utility.scanner.next());
            System.out.print("地址（"+house.getAddress()+"）：");
            house.setAddress(utility.scanner.next());
            System.out.print("租金（"+house.getRent()+"）：");
            house.setRent(utility.scanner.nextInt());
            System.out.print("状态（"+house.getState()+"）：");
            house.setState(utility.scanner.next());
            house.setDate(utility.stdTime(new Date()));

            houseService.update(house);
            System.out.println("———————————————————————————修改完成———————————————————————————");

        }

    }

}
