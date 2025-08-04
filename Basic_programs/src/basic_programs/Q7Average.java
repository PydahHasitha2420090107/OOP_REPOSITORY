package basic_programs;
import java.util.*;
public class Q7Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=(a+b+c)/3;
		int e=a+b+c/3;
		System.out.println("average is:"+d);
		System.out.println("average is:"+e);
		//using brackets or parenthesis we are getting proper order and answer
		scan.close();
	}

}
