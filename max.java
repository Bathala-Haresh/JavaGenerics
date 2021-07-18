
public class refactor1 
{
	public static <T extends Comparable> T max(T... elements) {
		T max = elements[0];
		for (T element : elements) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println("Integer Max: " + max(234,12,567,34,234));
		System.out.println("Double Max: " + max(1.2,5.6,7.8));
		System.out.println("String Max: " + max("haresh","ramesh","suresh","dilip","chinni","rajesh"));

	}
}