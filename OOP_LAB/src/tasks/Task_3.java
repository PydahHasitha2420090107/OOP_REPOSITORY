package tasks;
import java.util.*;
public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a="hello";
		String b="hello";
		String c=scan.nextLine();
		String d=scan.nextLine();
		System.out.println(a==b);
		System.out.println(c==d);//false because c and d points to a different object in heap memory, not the pool.
		System.out.println(c.equals(d));//true cause it checks the content
		//interning
		String e = a.intern(); // Now d points to the pool version
		System.out.println(a == e); // true a,e refer to same memory in heap
		//immutability
		String s = "oops";
		s.concat("advance"); 
		System.out.println(s); // prints world cause strings are immutable
		String t=s.concat("advance");
		System.out.println(t);
		String[] words = {"java", "is", "fun"};
		for (String w : words) {
            System.out.print(w + " ");
        }
		
		scan.close();
	}

}
