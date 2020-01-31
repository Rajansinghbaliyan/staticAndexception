import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean flag;
    static int B;
    static int H;

static void checker(int b,int h) throws java.lang.Exception {
       if(b<=0||h<=0){
           throw new java.lang.Exception();
       }

}
    static{
        Scanner scanner = new Scanner (System.in);
          B = scanner.nextInt();
          H = scanner.nextInt();
    
     
     try {
         checker(B,H);
         flag = true;
          
     }catch (java.lang.Exception ex){
         System.out.println("java.lang.Exception: Breadth and height must be positive");
         flag= false;
     }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

