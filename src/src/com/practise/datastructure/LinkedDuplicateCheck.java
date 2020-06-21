package src.com.practise.datastructure;

import java.util.LinkedHashSet;

public class LinkedDuplicateCheck {
    public static void main(String[] args) {
        /*LinkedHashMap<String,String> location=new LinkedHashMap<String, String>();
        location.put("Pune","Mumbai");
        location.put("Mumbai","Pune");
        location.put("Pune","banglore");
        location.put("banglore","karnataka");
        location.put("karnataka","banglore");

        /*
Problem Statement :- was to find a unqique location using hashcode and equals method  , a problem from walmart
        while(location!=null)*/
        Location l1=new Location("Pune","Mumbai");
        Location l2=new Location("Mumbai","Pune");

        LinkedHashSet<Location> data=new LinkedHashSet<>();
        data.add(l1);
        data.add(l2);
        data.add(new Location("Pune","banglore"));
        data.add(new Location("banglore","karnataka"));
        data.add(new Location("karnataka","banglore"));

        System.out.println(l1.hashCode()  == l2.hashCode());
        data.forEach(x->{
            Location type=(Location)x;

            System.out.println(x.getSource()+"Dest is"+x.getDestination());
        });

    }
}
