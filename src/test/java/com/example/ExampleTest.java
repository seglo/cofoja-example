package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest
   {
   @Test
   public void foo()
      {
      Assert.assertTrue(new Example().foo());
      }
   }
