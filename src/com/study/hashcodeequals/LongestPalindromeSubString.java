package com.study.hashcodeequals;

import java.util.ArrayList;

public class LongestPalindromeSubString {
    public static void main(String args[]) {

        String input ="cbbd";
        int i=0;
        int j=input.length()-1;
        char dataSet[]=input.toCharArray();
        int ans=0;
        ArrayList<Character> datanew=new ArrayList<Character>();
        ArrayList<Character> datanewEnd=new ArrayList<Character>();
        while(i<=j && i<input.length() && j>0){
            if(dataSet[i]!=dataSet[j]){
                i++;
                j--;
                datanew=new ArrayList<Character>();
                datanewEnd=new ArrayList<Character>();
            }else{
                if(i!=j){
                    datanew.add(dataSet[i]);
                    datanewEnd.add(dataSet[j]);

                }else{
                    datanew.add(dataSet[i]);
                }

                i++;
                j--;
            }
        }
         for(char element:datanew){
             System.out.println(element);
         }
        for(char element:datanewEnd){
            System.out.println(element);
        }


    }


}
