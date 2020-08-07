package com.study.hashcodeequals;

import java.util.HashMap;
//TIme complexity is O(n) and Space Complexity is O(n) due to map
public class NumberSumIndex {
    public static void main(String args[]){
        int target=13;
        int input[]={2,7,20,11};
        HashMap<Integer,Integer> dataIndex=new HashMap<Integer,Integer>();
        for(int i=0;i<input.length;i++){
            dataIndex.put(input[i],i);
        }
        for(int i=0;i<input.length;i++){
            int sum=target-input[i];
            if(dataIndex.get(sum)!=null){
                System.out.println("Index are "+i + "and "+dataIndex.get(sum));
                break;
            }
        }
    }
}
