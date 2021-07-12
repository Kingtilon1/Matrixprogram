package com.assignment3.www;
import java.lang.Exception;
/**
 * This class extends Exception to respond to inocrrect situations in the main program
 * 
 *
 */
public class MatrixInputException extends Exception {
	/**
	 * 
	 * @param first the first mismatched two-dim array
	 * @param second the second mistmatched two-dim array
	 */
	public MatrixInputException (double[][]first, double[][]second) {
		v1=first;
		v2=second;
	}

	

	


	/**
	 * The custom messages to be printed
	 */
	public void  ReportInstance() {
		System.out.println("Mismatch occured between vector factors:\n"+
	"\t First vector is of size"+v1.length+".\n"+"\t Contents: ");
		printContents(v1);
		System.out.println("Mismatch occured between vector factors:\n"+
				"\t Second vector is of size"+v2.length+".\n"+"\t Contents: ");
					printContents(v2);
	}
	/**
	 * prints array elements in order
	 * @param v the array to be printed
	 */
	private void printContents(double[][] v) {
		for(double[] element: v) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	private double[][] v2;
	private double[][]v1;
}