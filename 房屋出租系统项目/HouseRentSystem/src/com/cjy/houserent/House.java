package com.cjy.houserent;

/**
 * 一个House对象表示一个房屋信息
 * @author cjy
 * @version 1.0
 */
public class House {
    private int id;
    private String name;
    private String number;
    private String address;
    private int rent;
    private String state;
    private String date;

    public House(int id, String name, String number, String address, int rent, String state, String date) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.address = address;
        this.rent = rent;
        this.state = state;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
