package com.company;

public class Address {
    private int street_num;
    private int house_num;
    private String city;
    private int code;
    public Address(){
    }
    public Address(int sn, int hn, String c, int xyz){
        street_num = sn;
        house_num = hn;
        city = c;
        code = xyz;
    }
    public void setStreet_num(int street_num) {
        this.street_num = street_num;
    }
    public int getStreet_num() {
        return street_num;
    }
    public void setHouse_num(int house_num) {
        this.house_num = house_num;
    }
    public int getHouse_num() {
        return house_num;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setCityCode(int code) {
        this.code = code;
    }
    public int getCityCode() {
        return code;
    }
    public void display(){
        System.out.println("Address =  \nStreet number is" + street_num + ",house number is"
                + house_num + ",city name is" + city + ",city code is " + code);
    }
}
