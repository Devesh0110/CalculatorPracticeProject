import java.util.*;
public class Calculate {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 floating point numbers");
	float a=sc.nextFloat();
	float b=sc.nextFloat();
	Test obj=new Test(a,b);
	System.out.println(a+" + "+b+" = "+obj.add());
	System.out.println("Subtracting the numbers, result - "+obj.substract());
	System.out.println("Multiplying, value in integer - "+obj.multiply());
	System.out.println("Dividing them, result - "+obj.divide());
}
}
