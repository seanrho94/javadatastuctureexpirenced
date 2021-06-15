package com.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two strings are anagrams if they are made of the same letters arranged differently (ignoring the
 * case).
 */
public class CheckAnagrams {
  public static void main(String[] args) {
    System.out.println(isAnagrams("Silent", "Listen"));
    System.out.println( isAnagrams("This is a string", "Is this a string"));
    System.out.println( isAnagrams("There", "Their"));
  }


  /**
   *We b ui  :-
   *
   *
   *
   * silent
   * lissten
   *
   * s  :- 1   0
   * i - 1   0
   * l :- 1  :- 0
   * e 1    0
   * n :-  0
   * t := 1  0
   *
   * abcd
   * dcba
   * bdac
   *
   * Assume Mumbai as ba
   * Banglore as dc
   *
   * pune :- fe
   *
   * Pune Mumbai   :- fe to ba   :- abfe
   *                 ba to dc  :-Mumbai to Banglore      :-  abcd    :- ba to dc
   * Mumbai Pune    :- dc to ba  :- Banglore  Mumbai   :-  abcd
   * P
   * Check if two strings are anagrams or not
   *
   * @param s1 the first string
   * @param s2 the second string
   * @return {@code true} if two string are anagrams, otherwise {@code false}
   */
  public static boolean isAnagrams(String s1, String s2) {
    int l1 = s1.length();
    int l2 = s2.length();
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    Map<Character, Integer> charAppearances = new HashMap<>();

    for (int i = 0; i < l1; i++) {
      char c = s1.charAt(i);
      int numOfAppearances = charAppearances.getOrDefault(c, 0);
      charAppearances.put(c, numOfAppearances + 1);
    }

    for (int i = 0; i < l2; i++) {
      char c = s2.charAt(i);
      if (!charAppearances.containsKey(c)) {
        return false;
      }
      charAppearances.put(c, charAppearances.get(c) - 1);
    }

    for (int cnt : charAppearances.values()) {
      if (cnt != 0) {
        return false;
      }
    }
    return true;
  }
}
