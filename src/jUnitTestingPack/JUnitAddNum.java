package jUnitTestingPack;
import java.util.Scanner;

public class JUnitAddNum {
	public static void main(String[] args) {
	    int m, n, sum;
	    Scanner myObj = new Scanner(System.in); //Scanner object
	    System.out.println("enter num 1:");
	    m = myObj.nextInt(); 

	    System.out.println("enter num 2:");
	    n = myObj.nextInt(); 

	    sum = m + n;  // final result
	    System.out.println("Sum is: " + sum);
	  }

}
