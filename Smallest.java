package method;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// Write a Java method to find the smallest number among three numbers.
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("input the first number");
		
		
		double x = keyboard.nextDouble();
		System.out.println("input the second number");
		double y =keyboard.nextDouble();
		System.out.println("input the 3rd number");
		double z = keyboard.nextDouble();
		System.out.println("the smallest value is " + smallest(x,y,z) +"\n");

	}
public static double smallest (double x,double y,double z)
{
	return Math.min(Math.min(x, y), z);
}
}
