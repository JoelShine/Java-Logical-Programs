import java.util.*;

public class Angle_triangle
{
	public static void main(String[]args)
	{

		System.out.println("Input angles of a Triangle - ");
		Scanner sc=new Scanner(System.in);

		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();

		/*
		if ((a != b) && (c != a) && (b != c)) {
			System.out.println("This is a scalene Triangle.");

		} if ((a == b) || (c == a) || (b == c)){
			System.out.println("This is an isosceles Triangle");

		} if ((a == b) && (c == a) && (b == c)){
			System.out.println("This is an equilateral Triangle.");
		}
		*/

		if ((a==b) && (b==c)) {
			System.out.println("This is an equilateral Triangle.");
		} 
		else if ((a!=b) && (b!=c) && (a!=c)) {
			System.out.println("This is an scalene Triangle.");
		}
		else if ((a==b) || (b==c) || (a==c)) {
			System.out.println("This is an isosceles Triangle.");			
		}
	}
}