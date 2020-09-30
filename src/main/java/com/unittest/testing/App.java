package com.unittest.testing;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner input = new Scanner (System.in);
       
       System.out.print("input Celcius : ");
       double celcius = input.nextDouble();
       
       Fahrenheit f = new Fahrenheit();
       
       while(!f.isBound(celcius)) {
    	   System.out.println("Input Again!!!");
    	   System.out.print("input Celcius : ");
           celcius = input.nextDouble();
       }
       
       f.input(celcius);
       System.out.print(f.toString());
    }
}

//โจทย์เดิม แต่ไม่ให้รีเทรนใน calculate ให้สร้าง เมทธอดใหม่เพื่อมารับ รีเทรน แล้วก็ให้ เขียนเทสเคสให้ครบ ใช้เมนเดิม ให้รันออกมาได้ commit ขึ้น github 