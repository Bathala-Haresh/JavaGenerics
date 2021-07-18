
import java.util.Scanner;

public class refactor2<E extends Comparable> {
	E x, y, z;

	public refactor2(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static <T extends Comparable> T comparesion(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//float value from user
		System.out.println("enter the float value:");
		Float firstNumber = sc.nextFloat();
		Float secondNumber = sc.nextFloat();
		Float thirdNumber = sc.nextFloat();
		
		Float maxNumber = comparesion(firstNumber, secondNumber, thirdNumber);
		System.out.println("Maximum value is:" + maxNumber);
		System.out.println(" ");
		//integer value form user
		System.out.println("enter the integer value:");
		Integer firstNumbers = sc.nextInt();
		Integer secondNumbers = sc.nextInt();
		Integer thirdNumbers = sc.nextInt();
		
		Integer maxNumbers = comparesion(firstNumbers, secondNumbers, thirdNumbers);
		System.out.println("Maximum value is: " + maxNumbers);
		System.out.println(" ");
		//string value from user
		System.out.println("enter the String:");
		String firstString = sc.next();
		String secondString = sc.next();
		String thirdString = sc.next();
		
		String maxString = comparesion(firstString,secondString , thirdString);
		System.out.println("Maximum value is:" + maxString);
		sc.close();


	}
}