package com.example;

import com.google.java.contract.Ensures;

public class Example
   {
   @Ensures("result == true")
   boolean foo()
      {
      return false;
      }
   }
