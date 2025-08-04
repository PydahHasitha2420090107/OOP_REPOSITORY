package basic_programs;

import java.util.Scanner;

public class Q9Logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a>>b);
		System.out.println(a<<b);
		scan.close();
	}

}
