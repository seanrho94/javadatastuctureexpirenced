package com.study.hashcodeequals;

import java.util.HashMap;

public class LongestSubstring {

    public static void main(String args[]) {


        String input = "abcdabcbb";
        System.out.println(lengthOfLongestSubstring(input));
        int len = input.length();
        int count = 0;
        char dataSet[] = input.toCharArray();
        HashMap<String, Integer> list = new HashMap<>();
        String combineString="";
        for (int i = 0; i < len; i++) {
            char data = input.charAt(i);
            if (!(list.containsKey(data + ""))) {
                for (int j = i + 1; j < len; j++) {
                    if (data == dataSet[j]) {
                        count += 1;
                    }
                }
                combineString=combineString+data+"";
                if(combineString!=data+""){
                    String newString=combineString.substring(i+1);
                    int j= newString.indexOf(combineString);
                }
                list.put(data + "", count);

            }else{
                combineString=data+"";
            }

            System.out.println("Count for Charcter " + data + " is value " + count);
            count = 0;
        }
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
