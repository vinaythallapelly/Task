package com.degree;

public class StudentFee{
    private String sRoll;
    private double amount;
    private String date;

    public StudentFee(String sRoll,double amount,String date){
        this.sRoll=sRoll;
        this.amount=amount;
        this.date=date;
    }

    public void setsRoll(String sRoll) {this.sRoll = sRoll;}

    public String getsRoll() {return sRoll;}

    public void setAmount(double amount) {this.amount = amount;}

    public double getAmount() {return amount;}

    public void setDate(String date) {this.date = date;}

    public String getDate() {return date;}

}
