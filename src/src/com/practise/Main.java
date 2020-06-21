package src.com.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here00
        Student s1=new Student(150,"Jinesh");
        Student s2=new Student(2,"Jinesh");
        Student s3= new Student(10,"Myra");
        //Even if student objects are same hashcode is different
        System.out.println("Hash code of s1 is"+s1.hashCode());
        System.out.println("hash code of s2 is"+s2.hashCode());
        System.out.println("Check 2 sutudent are same or not please find the boolean value for same "+s1.equals(s2));
        /*
        Out put without hashcode and equals
        Hash code of s1 is460141958
        hash code of s2 is1163157884
        Check 2 sutudent are same or not please find the boolean value for samefalse
         */

        /*
        After

         */
        ArrayList<Student> data =new ArrayList<Student>();
        data.add(s1);
        data.add(s2) ;
        data.add(new Student(122,"Jinesh"));
        data.add(s3);
        Collections.sort(data,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getId()-o1.getId();
            }
        });

        System.out.println("Check number of objects stored "+data.size());
        for(Student list:data){
            System.out.println(list.id+list.name);
        }
        System.out.println();
 //       System.out.println("Hello world");


    }
}
