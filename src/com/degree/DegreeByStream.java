package com.degree;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class DegreeByStream {
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

        //Task-3

        List<Subjects> l2 = new ArrayList<>();

        System.out.println("Enter Subject No, Subject Name : ");
        Subjects sub1 = new Subjects(sc.nextInt(), sc.next());
        Subjects sub2 = new Subjects(sc.nextInt(), sc.next());
        l2.add(sub1);
        l2.add(sub2);

        List<StudentMarks> l3 = new ArrayList<>();

        System.out.println("Enter RollNo, Year, Subject No, Marks :");
        l.forEach(student -> {
            l2.forEach(subjects -> {
                l3.add(new StudentMarks(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble()));
            });
        });

        //Task -1 output

        System.out.println(" **********  Task - 1  ********** ");

        l.stream().filter(student -> student.getYear() == 1).forEach(year -> {
            System.out.println(year.getsRoll() + " " + year.getsName() + " " + year.getBranch());
        });

        //Task-2 output
        System.out.println(" **********  Task - 2  ********** ");
        l.stream().forEach(student -> {
            l1.stream().filter(studentFee -> student.getsRoll().equals(studentFee.getsRoll())).forEach(studentFee -> {
                System.out.println(student.getsRoll() + " " + student.getsName() + " " + student.getBranch() + " " +
                        studentFee.getAmount() + " " + studentFee.getDate());
            });
        });

        //Task-3 output

        System.out.println("Printing all student details");
        System.out.println(" **********  Task - 3  **********");

        l.stream().forEach(student -> {
            l3.stream().filter(studentMarks -> (studentMarks.getsRoll().equals(student.getsRoll()))).forEach(student1 -> {
                l2.stream().filter(subjects -> (subjects.getSubjectNo() == student1.getSubjectNo())).forEach(list -> {
                    System.out.println(student.getsRoll() + ", " + student.getsName() + ", " +
                            list.getSubjectName() + ", " + student1.getMarks());
                });
            });
        });

        // Task-4 sorting year wise

        System.out.println("Printing all students details by Sorting order(year):");
        System.out.println(" **********  Task - 4  ********** ");

        l.sort(new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return ((Integer)o1.getYear()).compareTo((o2.getYear()));
            }
        });


        l.forEach(student -> {
            l3.stream().filter(studentMarks -> (studentMarks.getsRoll().equals(student.getsRoll()))).forEach(student1 -> {
                l2.stream().filter(subjects -> (subjects.getSubjectNo() == student1.getSubjectNo())).forEach(list -> {
                    System.out.println(student.getsRoll() + ", " + student.getsName() + ", " +
                            list.getSubjectName() + ", " + student1.getMarks());
                });
            });
        });

    }
}