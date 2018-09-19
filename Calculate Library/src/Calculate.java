/* contains various mathods that do math calculations
 * @Author Tyler Kanoho
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
	public static double toRadians(double degrees) {
		return degrees * 3.14159 / 180;
	}
	//return discriminant(double) from three doubles a,b,c
	public static double discriminant(double a, double b, double c) {
		return b * b - 4 * b * c;
	}
	//return improper fraction(String) when input three mixed numbers(int)
	public static String toImproperfrac(int wholenumber, int numerator, int denominator) {
		int fraction = denominator * wholenumber + numerator;
		return fraction + "/" + denominator;
	}
	//return mixed number(String) when input numerator and denominator
	public static String toMixedNum(int number, int denom) {
		int wholeNum = number / denom;
		int newNumber = number % denom; 
		return wholeNum + "_" + newNumber + "/" + denom;
	}
	//return a String 
	public static String foil(int a, int b, int c, int d, String x) {
		int f = a * c;
		int o = a * d;
		int i = b * c;
		int l = b * d;
		int oi = o + i;
		return f + x + "^2" + "+" + oi + x + "+" + l;
	}
	public static boolean isDivisibleBy(int a, int b) {
		if(a % b == 0 ) {
			return true;
		} else {
			return false;
		}
	}
	public static double absValue(double a) {
		if(a < 0) {
			return a * (-1);
		}else { 
			return a;			
		}
	}
	public double max (double a, double b, double c) {
		if(a > b && a > c) {
			return a;
		} else if(b > a && b > c) {
			return b;
		} else { return c;
		}
	}
	public double min (double a, double b) {
		if(a > b) {
			return b;
		} else { return a;
		}
	} static double round2(double a) {
		if(a > 0) {
			a += 0.005;
		}else if(a ==0) {
			a = 0;
		}else {
			a -= -0.005;
		}
		a *= 100;
		double b = (int)a;
		b /= 100;
		return b;
		}
	public double exponent (double a, int b) {
		for(int i = 0; i < b; i++) {
			a = a * a;
		}
		return a;
	}
	public double factorial (int a) {
		for(int i = a; i > 0; i--) {
			a = a * i;
		}
		return a;
	}
	public boolean isPrime (int a) {
		if(a <= 1) {
			return false;
		}
		for(int i = 2; i < Math.sqrt(a); i++) {
			if(a % i == 0) {
			return false;
			}
			
		}
	return true;
}
	public static int gcf(int a, int b) {
		while(a != 0 && b != 0) {
			if(a >= b) {
				a = a - b;
			}else b = b - a;
			}
		if (a == 0) return b;
		else return a;
		}
	public static double sqrt(int number) {
		double t;
		double squareRoot = number / 2;
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		}while ((t - squareRoot) != 0);
		return squareRoot;
	}
}