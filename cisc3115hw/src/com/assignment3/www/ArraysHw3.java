package com.assignment3.www;

import java.util.Scanner;

public class ArraysHw3 {
	/**
	 * This program creates a multiplication program that multiplies two matrices 
	 * @param args
	 * @throws MatrixInputException 
	 */
		
		public static void main(String[] args) throws MatrixInputException {
			Scanner scan=new Scanner(System.in);//created for user input
			System.out.println("Enter row amount for first matrix ");
			
			int row=scan.nextInt();
			
			System.out.println("Enter column amount for first matrix \n");
			int col=scan.nextInt();
			
			System.out.println("Enter row amount for the second matrix");
			int frow=scan.nextInt();
			
			System.out.println("Enter column amount for the second matrix");
			int fcol=scan.nextInt();
			 
			
			
			double[][]a=new  double[row][col];
			double[][]b=new  double[frow][fcol];
			
			
			  
			System.out.println("Please enter elements in  first matrix : ");
			FillUp(scan, a, row, col);
			System.out.println();
			System.out.println("Please enter elements in second matrix : ");
			FillUp(scan, b, frow, fcol);
			
			try {  
			MultiplyMatrix(a, b, row, fcol);
			}catch(MatrixInputException e) {
				e.ReportInstance();
				e.printStackTrace();
			}
			 
				 
			
			
			
		}
			 
				 
			 
		

	
	/**
	 * method that fills array indexes with float numbers
	 * @param scan receives user input
	 * @param num references array called
	 * @param row references the row of every array called
	 * @param col references the column of every array called
	 */
		public static void FillUp(Scanner scan, double[][] num, int row, int col) {
			
			for(int a = 0; a < row; a++) {
				 for(int b = 0; b < col; b++)
		         {
					 num[a][b] = scan.nextDouble();
					 
		         }
			}
			
		}
		/**
		 * Program receives array info from all arrays and multiplies the matrices
		 * @param num receives the elements of array a in main program
		 * @param numb receives the elements of array b in main program
		 * @param numc receives the elements of array in main program
		 * @param rows is the rows of array  a
		 * @param columns is the column of array b
		 * Throws MatrixInputException when the row  of the first array and the column of the second array
		 * aren't equal 
		 */
		  public static void MultiplyMatrix (double a[][], double b[][], int row, int fcol)throws MatrixInputException {
				double[][] c=new double[row][fcol]; 
				int sum=0;
				//c stores the multiplication values
				if(row!=fcol) {
					throw new MatrixInputException(a,b);
				}
				for(int i=0;i<row;i++)
				{    
					for(int j=0;j<fcol;j++)
					{   
						
					for(int k=0;k<row+1;k++)      
					{  
						sum+=a[i][k]*b[k][j];
						     
					}//end of k loop  
					c[i][j]=sum;
					sum=0;
					}//end of j loop
			}
				for(int i=0; i<row; i++) {
					for(int j=0; j<fcol; j++) {
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				
		   }

		  }
}
	

