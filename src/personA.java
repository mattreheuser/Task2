import java.util.Scanner;

public class personA {

	public static void main(String[] args) {
		System.out.println("Please type in two integers for the average");
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		double avg = (first + second) / 2.0;
		System.out.println("The average is " + avg);
	}

}
