package Search.Stoksname;

import java.util.Scanner;

public class Arraydescendingorder {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int[] myIntegers=getIntegers(5); 
		int[] sorted=sortedIntegers(myIntegers);
		printArray(sorted);
}
	public static int[] getIntegers(int number) {
		int[] myarray=new int[number];
		System.out.println("Enter "+ number + " Integer Values:\r");
		for(int i=0;i<myarray.length;i++) {
			myarray[i]=scanner.nextInt();
		}
		return myarray;
		}
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Elemen " +i+ " Contains " +array[i]);
			}
	}
	public static int[] sortedIntegers(int[] array) {
		int[] sortedArray=new int[array.length];
		for(int i=0;i<array.length;i++) {
			sortedArray[i]=array[i];
		}
		boolean flag = true;
		int temp;
		while (flag) {
			flag=false;
			for(int i=0;i<sortedArray.length-1;i++) {
				if(sortedArray[i]<sortedArray[i+1]) {
					temp=sortedArray[i];
					sortedArray[i]=sortedArray[i+1];
					sortedArray[i+1]=temp;
					flag=true;
				}
			}
			}
		return sortedArray;
		}
}
