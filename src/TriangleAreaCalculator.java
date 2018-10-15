import java.util.Scanner;

public class TriangleAreaCalculator 
{

	public static void main(String[] args) 
	{
		Scanner area = new Scanner(System.in);
		System.out.print("Please enter your name:  ");
		String name = area.nextLine();
		System.out.println("\n\n\nHello, " + name + ", welcome to the Geometry Calculator!");
		System.out.println("Press enter to continue...");
		area.nextLine();
	}

}