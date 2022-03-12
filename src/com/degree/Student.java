package com.degree;

public class Student {
    private String sRoll;
    private String sName;
    private String branch;
    private int year;

    public Student(String sRoll,String sName,String branch,int year){
        this.sRoll=sRoll;
        this.sName=sName;
        this.branch=branch;
        this.year=year;
    }

    public String getsName() {
        return sName;
    }

    public String getsRoll() {
        return sRoll;
    }

    public int getYear() {return year;}

    public String getBranch() {return branch;}

    public void setYear(Integer year) {this.year = year;}

    public void setBranch(String branch) {this.branch = branch;}

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsRoll(String sRoll) {
        this.sRoll = sRoll;
    }


}
