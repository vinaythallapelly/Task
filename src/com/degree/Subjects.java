package com.degree;


public class Subjects  {
    private int subjectNo;
    private String subjectName;

    public Subjects(int subjectNo,String subjectName){
        this.subjectNo=subjectNo;
        this.subjectName=subjectName;
    }

    public int getSubjectNo() {return subjectNo;}

    public String getSubjectName() {return subjectName;}

    public void setSubjectName(String subjectName) {this.subjectName = subjectName;}

    public void setSubjectNo(int subjectNo) {this.subjectNo = subjectNo;}
}
