package com.lephuongquy05.love_app;

public class Deal {
    public static  final  int GROUP_EDU = 1;
    public static  final  int GROUP_SCHOOL = 2;
    public static  final  int GROUP_EAT = 3;
    private long id;
    private String title;
    private String note;
    private double price;
    private int groupID;


    public Deal() {
    }

    public Deal(long id, String title, String note, double price, int groupID) {
        this.id = id;
        this.title = title;
        this.note = note;
        this.price = price;
        this.groupID = groupID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }
}
