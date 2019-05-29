package com.bd.anagram;

import java.util.*;
import java.lang.*;
import java.io.*;

public class AnagramTest
{
 public static boolean isAnagram(String firstString, String secondString)
 {
  // remove all whitespaces and convert strings to lowercase
  firstString  = firstString.replaceAll("\\s", "").toLowerCase();
  secondString = secondString.replaceAll("\\s", "").toLowerCase();

  /* check string lengths are equal or not */
  if (firstString.length() != secondString.length())
  {
      return false;
  }
   
  // convert first string to char array
  char[] firstArray = firstString.toCharArray();

  // check each character of firstArray
  for (char c : firstArray)
  {
   int index = secondString.indexOf(c);
   if (index == -1)
   {
       return false;
   }
    secondString  = secondString.substring(0,index) + secondString.substring(index+1, secondString.length());
  }
  return true;
 }
 
 
  public static void main (String[] args)
 {
     String _firstString = "bleat";
     String _secondString ="table";
     
  boolean result = isAnagram(_firstString, _secondString);
  if(result)
  {
      System.out.println(_firstString+" and "+_secondString+" are anagrams");
  }
  else
  {
       System.out.println(_firstString+" and "+_secondString+" are not anagrams");
  }
 }
}