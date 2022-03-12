package com.degree;

import java.util.*;

public class Degree1{
    public static void main(String[] args) {

        //Task-1:
        Scanner sc = new Scanner(System.in);

        List<Student> l = new ArrayList<Student>();

        System.out.println("Enter no of students: ");
        int a= sc.nextInt();
        System.out.println("Enter Student RollNo, Name, Branch, Year : ");

        for(int i=1;i<=a;i++){
            l.add(new Student(sc.next(), sc.next(), sc.next(), sc.nextInt()));
        }

        //Task-2

        List<StudentFee> l1 = new ArrayList<>();

        System.out.println("Enter student RollNo, Amount, Date : ");
        for(int i=1;i<=a;i++) {
           l1.add(new StudentFee(sc.next(), sc.nextDouble(), sc.next()));
           };

        //Task-3

        List<Subjects> l2 = new ArrayList<>();
        System.out.println("Enter How Many Subjects: ");
        int b=sc.nextInt();
        System.out.println("Enter Subject No, Subject Name : ");
        for(int i=1;i<=b;i++){
            l2.add(new Subjects(sc.nextInt(), sc.next()));
        }

        List<StudentMarks> l3 = new ArrayList<>();

        System.out.println("Enter RollNo, Year, Subject No, Marks :");
        for(Student student:l) {
            for (Subjects subjects : l2) {
                l3.add(new StudentMarks(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble()));
            }
        }

        // Task-4
        l.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Integer I1=(Integer)o1.getYear();
                Integer I2=(Integer)o2.getYear();
                return I1.compareTo(I2);

            }
        });




        //Task -1 output
        System.out.println("Task-1: Student Roll No, Name, Branch (Only for 1st year students)");
        for (Student student : l) {
            if (student.getYear() == 1) {
                System.out.println(student.getsRoll() + " " + student.getsName() + " " + student.getBranch() + " ");
            }
        }

        //Task-2 output

        System.out.println("Task-2: Student Roll No, Name, Branch, Amount, Date (All Students)");
        for (Student student : l) {
            for (StudentFee studentFee : l1) {
                if (student.getsRoll().equals(studentFee.getsRoll())) {
                    System.out.println(student.getsRoll() + " " + student.getsName() + " " + student.getBranch() + " " +
                            studentFee.getAmount() + " " + studentFee.getDate());
                }
            }
        }

        //Task-3 output

        System.out.println("Task-3: Student Roll No, Name, Subject Name, Marks (All Students)");
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

        //Task-4 output

        System.out.println("Task-4: Student Roll No, Name, Subject Name, Marks (Order by Year)");
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