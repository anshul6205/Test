package ArrayLearning;

import java.util.Scanner;

public class MinEleChal {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Count");
		int count=scanner.nextInt();
		scanner.nextLine();
		
		int[] returnedArray= readIntegers(count);
		int returnedMin=findmin(returnedArray);
		System.out.println("The Min is= " +returnedMin);

	}
 private static int[] readIntegers(int count) {
	 int[] array=new int[count];
	 for(int i=0;i<array.length;i++) {
		 System.out.println("Enter the number: ");
		 int number=scanner.nextInt();
		 scanner.nextLine();
		 array[i]=number;
		 
	 }
	 return array;
 }
 
 public static int findmin(int[] array) {
	 int min=Integer.MAX_VALUE;
	 for(int i=0;i<array.length;i++) {
		 int value=array[i];
		 if(value<min) {
			 min=value;
		 }
	 }
	 return min;
 }
}
