package Homework;
import java.util.*;
import java.lang.Math;

public class projectone {
	 private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		 double number;
	        int numSample;
	        int i;
	        int count = 1;
	        
	        i = 0;
	        double sumNum;
	        
	        sumNum = 0;
	        double sumNumPow2;
	        
	        sumNumPow2 = 0;
	        double stanDev;
	        
	        stanDev = 0;
	        System.out.println("ขนาดกลุ่มตัวอย่าง");
	        numSample = input.nextInt();
	        double[] dat = new double[numSample];
	        
	        while (i <= numSample - 1) {
	        	System.out.println("ข้อมูลกลุ่มตัวอย่างลำดับที่ : "+count);
	            number = input.nextDouble();
	            dat[i] = number;
	            sumNum = sumNum + dat[i];
	            sumNumPow2 = sumNumPow2 + dat[i] * dat[i];
	            i = i + 1;
	            count = count + 1;
	        }
	        stanDev = Math.sqrt((numSample * sumNumPow2 - sumNum * sumNum) / (numSample * (numSample - 1)));
	        System.out.println("====================================");
	        System.out.println("Standard Deviation คือ");
	        System.out.println(stanDev);
	        System.out.println("====================================");
	    }
	}
