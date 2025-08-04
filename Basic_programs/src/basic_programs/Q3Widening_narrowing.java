package basic_programs;

public class Q3Widening_narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 123456;
	     long l = i; 
	     float f = l;
	        System.out.println("Original int value   : " + i);
	        System.out.println("After converting to long  : " + l);
	        System.out.println("After converting to float : " + f);
	        if (f== i) {
	            System.out.println("No data loss ");
	        } else {
	            System.out.println("Data may be approximated in float.");
	        }
	}

}
