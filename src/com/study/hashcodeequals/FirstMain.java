package com.study.hashcodeequals;

public class FirstMain {
    public static  void  main(String[] args){
        Student s1=new Student(150,"Jinesh");
        Student s2=new Student(2,"Jinesh");
        Student s3= new Student(10,"Myra");
        //Even if student objects are same hashcode is different
        System.out.println("Hash code of s1 is"+s1.hashCode());
        System.out.println("hash code of s2 is"+s2.hashCode());
        System.out.println("Check 2 sutudent are same or not please find the boolean value for same "+s1.equals(s2));
    }

}
