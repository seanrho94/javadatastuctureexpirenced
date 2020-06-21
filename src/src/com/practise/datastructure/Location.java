package src.com.practise.datastructure;

import java.util.Arrays;
import java.util.Objects;

public class Location implements Comparable {
    String source;
    String destination;

    public Location(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        String finalString=source+destination;
        char[] set=finalString.toCharArray();

        Arrays.sort(set);

        String finalString1=((Location) o).getSource()+((Location) o).getDestination();
        char[] set1=finalString1.toCharArray();

        Arrays.sort(set1);
        int h=0;
        for (int i = 0; i < set.length; i++) {
            h = 31 * h + set[i];
        }

        int h1=0;
        for (int i = 0; i < set1.length; i++) {
            h1 = 31 * h1 + set1[i];
        }
        return h==h1;

    }

    @Override
    public int compareTo(Object o) {

        Location location = (Location) o;
        String finalString=source+destination;
        char[] set=finalString.toCharArray();

        Arrays.sort(set);

        String finalString1=((Location) o).getSource()+((Location) o).getDestination();
        char[] set1=finalString1.toCharArray();

        Arrays.sort(set1);
        Integer hash1=Objects.hash(set);
        Integer hash2=Objects.hash(set1);
        if(hash1.equals(hash2) == true){
            return 0;
        }else{
            return 1;
        }

    }

    @Override
    public int hashCode() {
        String finalString=source+destination;
            char[] set=finalString.toCharArray();

        Arrays.sort(set);
        System.out.println(String.valueOf(set));
        int h=0;
        for (int i = 0; i < set.length; i++) {
            h = 31 * h + set[i];
        }
        return h;

    }

    }

