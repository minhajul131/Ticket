package com.example.ticket;

public class Bus {

    private String name;
    private String from;
    private String to;
    private String time;
    private String date;
    private String price;

    public Bus() {
    }

    public Bus(String name, String from, String to, String time, String date ,String price) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.time = time;
        this.date = date;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
