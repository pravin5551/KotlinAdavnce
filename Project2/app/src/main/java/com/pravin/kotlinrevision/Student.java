package com.pravin.kotlinrevision;

public class Student {
   private static Student student;
   private int id;
   private String name;

   private Student(int id,String name){
       id = id;
       name = name;
   }

   public static Student getInstance(int id, String name){
       if(student == null){
           student = new Student(id, name);
           return student;
       }
       return student;
   }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }
}

