package ArrayLearning;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array= {1, 2,8,9,6,8};
		System.out.println("before Reverse = " +Arrays.toString(array));
		reverse(array);
		System.out.println("After Reverse = " +Arrays.toString(array));

	}
    public static void reverse(int[] array) {
	int maxindex=array.length-1;
	int halfLength=array.length/2;
	for(int i=0;i<halfLength;i++) {
		int temp=array[i];
		//array0=1
		//array1=2
		//array2=8
		array[i]=array[maxindex-i];
		//array0=1 = array5=8
		//array1=2 = array4=6
		//array2=8 = array3=9
		array[maxindex-i]=temp;
		//array5=8 = 1
		//array4=2
		//array3=8
		}
	}
}
