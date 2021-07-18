import java.util.*;

public class GenericsMax <T extends Comparable>{
	//generics Array
	private T[] inputArray;

	public T[] getInputArray() {
		return inputArray;
	}

	public void setInputArray(T[] inputArray) {
		this.inputArray = inputArray;
	}

	//method to find max of array of any data type
	private static <T extends Comparable> void getMax(T[] array){
		T max = array[0];
		for (int i=0;i<array.length; i++){
			if (array[i].compareTo(max)>0){
				max=array[i];
			}
		}
		GenericsMax.printMax(max);

	}

	//Extend the max method to print max 
	private static<T> void printMax(T max) {
		System.out.println("Maximum is : "+max);
	}

	public static void main(String[] args) {
		// declaring array,double and float
		Integer[] intArray={ 1,12,123,1234,12345};
		Double[] doubleArray={1.2,1.23,12.3,123.123,0.123};
		String[] stringArray={"Haresh","sourabh","vaishnavi","divya","ashish"};

		System.out.println("maximum of integer value is :");
		GenericsMax.getMax(intArray);

		System.out.println("maximum of Float value is:");
		GenericsMax.getMax(doubleArray);

		System.out.println("maximum of String value is:");
		GenericsMax.getMax(stringArray);
	}
}