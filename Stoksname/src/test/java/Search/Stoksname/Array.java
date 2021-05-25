package Search.Stoksname;

import java.util.Scanner;

public class Array {
	
	private static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
	int[] myintegers=getintegers(5);
	for(int i=0;i<myintegers.length;i++) {
		System.out.println("Element " + i +", typed value was "+myintegers[i]);
	}
	System.out.println("The average is " +getaverage(myintegers));
		}
	public static int[] getintegers(int number) {
		System.out.println("Enter " + number + " Integer values\r");
		int[] values=new int[number];
		for(int i=0;i<values.length;i++) {
		values[i]=scanner.nextInt(); 
		}
		return values;
	}
	
	public static double getaverage(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return (double)sum/ (double)array.length;
	}
}
