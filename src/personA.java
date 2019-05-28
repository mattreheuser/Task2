import java.util.*;
//fixed import

public class personA {

	public static void main(String[] args) {
		System.out.println("Type in two ints");
		//fixed grammar
		Scanner scan = new Scanner(System.in);
		int one = scan.nextInt();
		int two = scan.nextInt();
		//fixed names
		double avg = (one + two) / 2.0;
		System.out.println("The average is " + avg);
	}

}


