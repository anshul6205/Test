package ArrayLearning;

import java.util.Arrays;

public class ArraRefVal {

	public static void main(String[] args) {
		int myIntValue=10;
		int anotherIntValue=myIntValue;
		
		System.out.println("MyIntValue = "+myIntValue);
		System.out.println("anotherIntValue = "+anotherIntValue);
		
		anotherIntValue++;
		
		System.out.println("MyIntValue = "+myIntValue);
		System.out.println("anotherIntValue = "+anotherIntValue);
		
		int[] myIntArray=new int[5];
		int[] anotherIntArray=myIntArray;
		
		System.out.println("MyIntArray = "+Arrays.toString(myIntArray));
		System.out.println("anotherIntArray = "+Arrays.toString(anotherIntArray));
		
		anotherIntArray[0]=1;

		System.out.println("AfterChange = "+Arrays.toString(myIntArray));
		System.out.println("anotherIntArrayAfterChange = "+Arrays.toString(anotherIntArray));
		
		anotherIntArray=new int[] {4,5,6,7,8};
		modifyArray(myIntArray);
		System.out.println("AfterChange = "+Arrays.toString(myIntArray));
		System.out.println("anotherIntArrayAfterChange = "+Arrays.toString(anotherIntArray));

	}
	
	private static void modifyArray(int[] array) {
		array[0]=2;
		array=new int[] {1,2,3,4,5};
		
	}

}
