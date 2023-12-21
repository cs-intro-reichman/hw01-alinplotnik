/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
	// Put your code here
	Double a = (double)Integer.parseInt(args[0]);
	Double b = (double)Integer.parseInt(args[1]);
	Double c = (double)Integer.parseInt(args[2]);
	Double x = ((c-b)/a);
	
	System.out.println(a + " * x + " + b + " = " + c);
	System.out.println("x = " + x);
	
	}
}