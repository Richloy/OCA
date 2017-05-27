package com.javadevelopers.apps;
import com.javadevelopers.projects.*;

public class JAT1Ex4 extends A{

   public static void main(String[] args){
     new JAT1Ex4().test();
   }

   public void test(){
     //System.out.println(new A().a);  // Error!
	 System.out.println("Value is: " + a);
   }
}