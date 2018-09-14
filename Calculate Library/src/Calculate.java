/* contains various mathods that do math calculations
 * @Author Tyler Kanohoember 6, 2018
 * @version 9/12/18
 */
public class Calculate {
	
	public static int square(int number) {
		return number*number;
	}
	//return the cube of an integer
	public static int cube(int number) {
		return number * number * number;
	}
	//return the average of the two doubles
	public static double average(double num1, double num2) {
		return (num1 + num2)/2;
	}
	//return degrees(double) of the input radians(double)
	public static double toDegree(double radians) {
		return radians * 180 / 3.1429;
	}
	//return radians(double)of the input degrees(double)
	public static double toRadians(double degree) {
		return degrees * 3.14159 / 180;
	}
	//return discriminant(double) from three doubles a,b,c
	public static double discriminant(double a, double b, double c) {
		return b * b - 4 * b * c;
	}
	//return improper fraction(String) when input three mixed numbers(int)
	public static String toImproperfrac(int whole number, int numerator, int denominator) {
		int fraction = denominator * wholenumber + numerator;
		return fraction + "/" + denominator;
		
	}
	}