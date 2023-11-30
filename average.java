package com.test.tinkering;
import java.util.Scanner;

/*
 * Name: Faezahbanu Diwan
 * Due Date: 25th March, 2023
 * Description : This program is created to check the average of the numbers prompted by the user's data provided.
 *
 * */

/*Initiated a class average*/
public class average {

	public static void main(String[] args) {
    
		/*Created a float and integer variable to store values inputed by the user*/
		
		int n; float avg= 0.0f ;
		Scanner sc =new Scanner(System.in);
		
		/*Prompt the user to ask for the number of values they want*/
		
		System.out.println("How many values you want to enter:" );
		
		/*This will scan the next integer and output it*/
		
		n=sc.nextInt();
		
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter value # " + ( i+ 1) + "=");
			a[i]=sc.nextInt();
			
		}
		boolean invalidInput;
	      do {
	            invalidInput = false;
	            try {
	            	
	                n = sc.nextInt();
	            } catch (Exception e) {
	                System.out.println("Please enter a valid positive integer.\n");  
	                invalidInput = true;
	                sc.nextLine();
	            } 
	        } while (invalidInput);
	
	for (int i = 0; i < n; i++)
	{
		avg=avg+a[i];
		
  
		System.out.println("The average is ="+avg/n);
		

		
		
	}

}
