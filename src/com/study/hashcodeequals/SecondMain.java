package com.study.hashcodeequals;
import java.util.*;
public class SecondMain {
    public static  void  main(String[] args){

        Student s1=new Student(150,"Jinesh");
        Student s2=new Student(2,"Jinesh");
        Student s3= new Student(10,"Myra");




        ArrayList<Student> data =new ArrayList<Student>();
        data.add(s1);
        data.add(s2) ;
        data.add(new Student(122,"Jinesh"));
        data.add(s3);
        // Following object is repeated , and so we should see one less count
        data.add(new Student(150,"Jinesh"));
        HashSet<Student> dataSet=new HashSet<>();
        dataSet.addAll(data);
        ArrayList<Student> data1=new ArrayList<>(dataSet);
        //To increase Array List capacity
        data1.ensureCapacity(50000);


        System.out.println("Check number of objects stored "+data1.size());
        Collections.sort(data,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getId()-o1.getId();
            }
        });


        for(Student list:data){
            System.out.println(list.id+list.name);
        }
        System.out.println("Check number of objects stored "+data.size());
        /*
        Check number of objects stored 4
        150Jinesh
        150Jinesh
        122Jinesh
            10Myra
        2Jinesh
        Check number of objects stored 5

         */
        Object[] finalList=data.toArray();
        for(Object list:finalList){
            Student iterator=(Student)list;
            System.out.println("Get id is"+iterator.id+"name is "+iterator.name);
        }

    }
}

