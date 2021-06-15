package com.strings;

/**
 * Given a string, moving several characters in front of the string to the end of the string. For
 * example, move the two characters'a' and 'b' in front of the string "abcdef" to the end of the
 * string, so that the original string becomes the string "cdefab"
 */
public class Rotation {
  public static void main(String[] args) {
    assert rotation("abcdefghijkl", 3).equals("defghijklabc");
    char[] values = "abcdefghijkl".toCharArray();
    rotation(values, 3);
    assert new String(values).equals("defghijklabc");
  }

  /**
   *
   * abcdef
   * 012345
   *
   *
   * abcdef
   *
   * badefc:-
   *
   *
   * cdefab
   * ab
   * cdef
   * Move {@code n} characters in front of given string to the end of string time complexity: O(n)
   * space complexity: O(n)
   *
   * @param s given string
   * @param n the total characters to be moved
   * @return string after rotation
   * cdefab
   * 012  abcdef
   * cbe
   */
  public static String rotation(String s, int n) {
    return s.substring(n) + s.substring(0, n);
  }

  /**
   * Move {@code n} characters in front of given character array to the end of array time
   * complexity: O(n) space complexity: O(1)
   *
   * @param values given character array
   * @param n the total characters to be moved
   *
   *          cdef
   *          dc
   */           //    cdefab 2

  public static void rotation(char[] values, int n) {
    reverse(values, 0, n - 1);
    System.out.println("Intial loop");
    for(char value:values){
      System.out.print(value);
    }
    reverse(values, n, values.length - 1);
    System.out.println("");
    System.out.println("Second loop");
    for(char value:values){
      System.out.print(value);
    }
    reverse(values, 0, values.length - 1);
    System.out.println("");
    System.out.println("Third loop");
    for(char value:values){
      System.out.print(value);
    }
  }

  /**
   * Reverse character array
   *
   * @param values character array
   * @param from begin index of given array
   * @param to end index of given array
   */
  public static void reverse(char[] values, int from, int to) {
    while (from < to) {
      char temp = values[from];
      values[from] = values[to];
      values[to] = temp;
      from++;
      to--;
    }
  }
}

