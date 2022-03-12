package com.degree;

public class StudentMarks {
    private String sRoll;
    private int year;
    private int subjectNo;
    private double marks;

    public StudentMarks(String sRoll,int year,int subjectNo,double marks){
        this.sRoll=sRoll;
        this.year=year;
        this.subjectNo=subjectNo;
        this.marks=marks;
    }

    public String getsRoll() {return sRoll;}

    public void setsRoll(String sRoll) {this.sRoll = sRoll;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}

    public int getSubjectNo() {return subjectNo;}

    public void setSubjectNo(int subjectNo) {this.subjectNo = subjectNo;}

    public double getMarks() {return marks;}

    public void setMarks(double marks) {this.marks = marks;}
}
