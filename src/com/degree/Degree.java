package com.degree;

import java.util.*;
import java.util.List;

public class Degree {
    public static void main(String[] args) {

        //Task-1:
        Scanner sc = new Scanner(System.in);

        List<Student> l = new ArrayList<>();

        System.out.println("Enter Student RollNo, Name, Branch, Year : ");
        Student s1 = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt());
        Student s2 = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt());
        Student s3 = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt());
        Student s4 = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt());

        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);

        //Task -1 output
        for (Student student : l) {
            if (student.getYear() == 1) {
                System.out.println(student.getsRoll() + " " + student.getsName() + " " + student.getBranch() + " ");
            }
        }

        //Task-2

        List<StudentFee> l1 = new ArrayList<>();

        System.out.println("Enter student RollNo, Amount, Date : ");
        StudentFee s10 = new StudentFee(sc.next(), sc.nextDouble(), sc.next());
        StudentFee s11 = new StudentFee(sc.next(), sc.nextDouble(), sc.next());
        StudentFee s12 = new StudentFee(sc.next(), sc.nextDouble(), sc.next());
        StudentFee s13 = new StudentFee(sc.next(), sc.nextDouble(), sc.next());

        l1.add(s10);
        l1.add(s11);
        l1.add(s12);
        l1.add(s13);

        //Task-2 output
        for (Student student : l) {
            for (StudentFee studentFee : l1) {
                if (student.getsRoll().equals(studentFee.getsRoll())) {
                    System.out.println(student.getsRoll() + " " + student.getsName() + " " + student.getBranch() + " " +
                            studentFee.getAmount() + " " + studentFee.getDate());
                }
            }
        }

        //Task-3

        List<Subjects> l2 = new ArrayList<>();

        System.out.println("Enter Subject No, Subject Name : ");
        Subjects sub1 = new Subjects(sc.nextInt(), sc.next());
        Subjects sub2 = new Subjects(sc.nextInt(), sc.next());
        l2.add(sub1);
        l2.add(sub2);

        List<StudentMarks> l3 = new ArrayList<>();

        System.out.println("Enter RollNo, Year, Subject No, Marks :");
        for(Student student:l) {
            for (Subjects subjects : l2) {
                l3.add(new StudentMarks(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble()));
            }
        }
        //Task-3 output
        for(Student student:l){
            for(StudentMarks studentMarks:l3){
                if(student.getsRoll().equals(studentMarks.getsRoll())){
                    for(Subjects subjects:l2){
                        if(studentMarks.getSubjectNo()==subjects.getSubjectNo()){
                            System.out.println(student.getsRoll()+", "+student.getsName()+", "+
                                    subjects.getSubjectName()+", "+studentMarks.getMarks());
                        }
                    }
                }
            }
        }

        // Task-4
        l.sort(new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                Integer I1=o1.getYear();
                Integer I2=o2.getYear();
                return I1.compareTo(I2);

            }
        });

      //Task-4 output
        System.out.println();
        for(Student student:l){
            for(StudentMarks studentMarks:l3){
                if(student.getsRoll().equals(studentMarks.getsRoll())){
                    for(Subjects subjects:l2){
                        if(studentMarks.getSubjectNo()==subjects.getSubjectNo()){
                            System.out.println(student.getsRoll()+", "+student.getsName()+", "+
                                    subjects.getSubjectName()+", "+studentMarks.getMarks());
                        }
                    }
                }
            }
        }
    }
}