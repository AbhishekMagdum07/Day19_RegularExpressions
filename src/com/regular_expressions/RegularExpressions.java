package com.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpressions {

    // Uc1 = As a User need to enter a valid First Name = First name starts with Cap and has minimum 3 characters
  public static void firstName() {

       Pattern pattern = Pattern.compile("^[A-Z]\\w{3,}$");

       Matcher matcher = pattern.matcher("Abhishek");
      if (matcher.find() == true) {
          System.out.println("Valid First Name.");
      }else{
          System.out.println("Invalid First Name");
      }
  }
  // Uc2 = As a User need to enter a valid Last Name = Last name starts with Cap and has minimum 3 characters
  public static void lastName(){

        Pattern pattern = Pattern.compile("^[A-Z]\\w{3,}$");

        Matcher matcher = pattern.matcher("Magdum");
      if (matcher.find() == true) {
          System.out.println("Valid Last Name.");
      }else{
          System.out.println("Invalid Last Name");
      }
  }

  public static void main(String[] args) {
      firstName();
      lastName();
  }
}

