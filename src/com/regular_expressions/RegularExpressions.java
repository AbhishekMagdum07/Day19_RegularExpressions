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
  // Uc3 = As a User need to enter a valid email
  //E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) wit precise @ and . positions
  public static void validEmail(){

      Pattern pattern = Pattern.compile("^[a-z\\d]{1,}[@][a-z\\d]{1,}[.]com$");

      Matcher matcher = pattern.matcher("abhishekmagdum07@gmail.com");
        if (matcher.find() == true) {
            System.out.println("Email is Valid");
        }else{
            System.out.println("Email is Invalid");
        }
  }
  // Uc4 = As a User need to follow pre -define Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number
  public static void phoneNumber(){
      Pattern pattern = Pattern.compile("^[+]\\d{2} \\d{10}$");

      Matcher matcher = pattern.matcher("+91 7066987376");
      if (matcher.find() == true) {
          System.out.println("Phone Number is Valid");
      }else{
          System.out.println("Phone Number is Invalid");
      }
  }

  public static void main(String[] args) {
      firstName();
      lastName();
      validEmail();
      phoneNumber();
  }
}

