package com.degree;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        HashMap<Integer,List> hT=new HashMap<>();
        List l=new ArrayList();
        l.add("Vinay");
        l.add(20);
        l.add(30);
        l.add("1st year");

        List l1=new ArrayList();
        l1.add("Vijay");
        l1.add(25);
        l1.add(35);
        l1.add("2nd year");

        hT.put(102,l);
        hT.put(101,l1);


      for(Map.Entry entry:hT.entrySet()){
          System.out.println("Key: "+entry.getKey()+"- Values: "+entry.getValue());
      }
    }
}
