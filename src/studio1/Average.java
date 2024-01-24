package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Gimme an integer:");
		int n1 = in.nextInt();
		System.out.print("Gimme another integer:");
		int n2 = in.nextInt();
		double Avg = (n1+n2)/2.0;
		System.out.print(Avg);
	}

}
