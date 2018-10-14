package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double x;
		Double y;

		System.out.println("Enter the coordinate x");
		x = sc.nextDouble();

		System.out.println("Enter the coordinate y");
		y = sc.nextDouble();

		sc.close();
		
		
		if (Math.sqrt(Math.pow(Math.abs(x), 2) + Math.pow(Math.abs(y), 2)) > 4) {
			System.out.println("Dot is not in the circle");
		} else {
			System.out.println("Dot in the circle");
		}
		
		//
		//System.out.println(Math.sqrt(Math.pow(Math.abs(x), 2) + Math.pow(Math.abs(y), 2)));

	}

}
