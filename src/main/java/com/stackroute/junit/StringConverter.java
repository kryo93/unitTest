package com.stackroute.junit;

public class StringConverter {
    public String concatAndToUpperCase(String message1, String message2){
      if(message1==null || message2==null)
      {
          return "Please enter non null value";
      }
          String concatedString = message1.concat(message2);

          return concatedString.toUpperCase();




    }

}
