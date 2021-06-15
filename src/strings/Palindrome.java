package com.strings;

/** Wikipedia: https://en.wikipedia.org/wiki/Palindrome */
class Palindrome {

  /** Driver Code */
  public static void main(String[] args) {
    String[] palindromes = {null, "", "aba", "123321"};
    for (String s : palindromes) {
      assert isPalindrome(s) && isPalindromeRecursion(s) && isPalindrome1(s);
    }

    String[] notPalindromes = {"abb", "abc", "abc123"};
    for (String s : notPalindromes) {
      assert !isPalindrome(s) && !isPalindromeRecursion(s) && !isPalindrome1(s);
    }
  }

  /**
   * Check if a string is palindrome string or not
   *
   * @param s a string to check
   * @return {@code true} if given string is palindrome, otherwise {@code false}
   */
  public static boolean isPalindrome(String s) {
    return (s == null || s.length() <= 1) || s.equals(new StringBuilder(s).reverse().toString());
  }

  /**
   *   abba
   *
   *   1st
   *   Base case  :- null    :- its palindrone  ( any confition)
   *
   *
   *   2 nd :-
   *   if i do first with last :- equal
   *
   *
   *   3 rd condition  :- decaying :- redcuing my self
   *
   *
   *
   *
   *
   *
   *
   *
   *
   *
   *
   * b
   * Check if a string is palindrome string or not using recursion
   *
   * @param s a string to check
   * @return {@code true} if given string is palindrome, otherwise {@code false}
   */
  public static boolean isPalindromeRecursion(String s) {
    if (s == null || s.length() <= 1) {
      return true;
    }

    if (s.charAt(0) != s.charAt(s.length() - 1)) {    //b== b
      return false;
    }
//abba:-        s.subs   :- bb    b
    return isPalindrome(s.substring(1, s.length() - 1));
  }

  /**
   * Check if a string is palindrome string or not another way
   *
   * @param s a string to check
   * @return {@code true} if given string is palindrome, otherwise {@code false}
   */
  public static boolean isPalindrome1(String s) {
    if (s == null || s.length() <= 1) {
      return true;
    }
    for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
    }
    return true;
  }
}
