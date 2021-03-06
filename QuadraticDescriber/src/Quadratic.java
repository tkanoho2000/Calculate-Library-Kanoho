
public class Quadratic {
	public static double square(double number) {
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
		return b * b - 4 * a * c;
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
	//returns whether or not an integer is divisible by another number
	public static boolean isDivisibleBy(int a, int b) {
		if(a == 0) throw new IllegalArgumentException("Cannr not factor 0");
		if(a % b == 0 ) {
			return true;
		} else {
			return false; 
		}
	}
	//returns the absolute value
	public static double absValue(double a) {
		if(a < 0) {
			return a * (-1);
		}else { 
			return a;			
		}
	}
	//returns the largest number of the value passed
	public double max (double a, double b, double c) {
		if(a > b && a > c) {
			return a;
		} else if(b > a && b > c) {
			return b;
		} else { return c;
		}
	}
	//returns the smaller number of the value passed
	public double min (double a, double b) {
		if(a > b) {
			return b;
		} else { return a;
		}
		//rounds a double correctly to 2 decimal places
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
	//returns a value to a positive integer power
	public double exponent (double a, int b) {
		if(a < 0) throw new IllegalArgumentException("Cannot have a negative as an exponent");

		for(int i = 0; i < b; i++) {
			a = a * a;
		}
		return a;
	} 
	//returns the factorial of the value passed
	public double factorial (int a) {
		if(a < 0) throw new IllegalArgumentException("Cannot create the factorial of a negative number");
		for(int i = a; i > 0; i--) {
			a = a * i;
		}
		return a;
	}
	//accepts two positive integers and returns a boolean prime
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
	//returns the greatest common factor of a number
	public static int gcf(int a, int b) {
		while(a != 0 && b != 0) {
			if(a >= b) {
				a = a - b;
			}else b = b - a;
			}
		if (a == 0) return b;
		else return a;
		}
	//returns the square root of a number
	public static double sqrt(double d) {
		if(d <= 0) throw new IllegalArgumentException("Cannot square root negative numbers");
		double t;
		double squareRoot = d / 2;
		do {
			t = squareRoot;
			squareRoot = (t + (d / t)) / 2;
		}while ((t - squareRoot) != 0);
		return squareRoot;
	}
	public static String quadForm(double a, double b, double c) {
		if(discriminant(a, b, c) < 0) {
			return "No real roots"; 
		}else if(discriminant(a, b, c) == 0) {
			return round2(-1*b/(2*a))+"";
		}else {
			double result1 = (((-1*b) + sqrt(discriminant(a, b, c))));
		 result1 = result1/(2*a);
			double result2 = (((-1*b) - sqrt(discriminant(a, b, c))));
			 result2 =  result2/(2*a);
			return round2(result1) + " and " + round2(result2);
			}
		}
	}
	public

