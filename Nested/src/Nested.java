/**
 * Author:	Sam Cooney
 * Project:	Nested
 * Date:	Oct 25, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

import java.util.Scanner;	// Allows use of Scanner class.

public class Nested {

	public static void main(String[] args) {
		Box myBox = new Box(10);					// Instantiate object from Box class.
		Scanner scan = new Scanner(System.in);		// Instantiate object from Scanner class.
		int rows1 = 0;int rows2 = 0;int rows3 = 0;	// Variables for rows for each triangle.
		int count1 = 0;int count2 = 0;				// Variables for loop counting.
		
		while(rows1 <= 5) {			// Begin loop.
			
			System.out.println("Enter the number of rows in first triangle.(Greater than 5)");
			rows1 = scan.nextInt();	// Scan in integer value for rows.
			scan.nextLine();		// Skip a line to place the cursor.
			if(rows1 <= 5) {		// Error Message.
				
				System.out.println("Error: Number was not large enough.");
			}						// End Error.
		} 							// End loop.
		
		while(count1 < rows1) {		// Begin outer loop.
			int i = 0;				// Local variable used for counting.
			
			while(i <= count1) {	// Begin inner loop.
				
				System.out.print("#");
				i++;				// Increment i.
			}						// End inner loop.
			System.out.println();	// Skip a line.
			count1++;				// Increment count1.
		}							// End outer loop.
		
		while(rows2 <= 5) {			// Begin loop.
			
			System.out.println("Enter the number of rows in second triangle.(Greater than 5)");
			rows2 = scan.nextInt();	// Scan in integer value for rows.
			scan.nextLine();		// Skip a line to place the cursor.
			if(rows2 <= 5) {		// Error Message.
				
				System.out.println("Error: Number was not large enough.");
			}						// End Error.
		} 							// End loop.
		
		do {						// Begin outer loop.
			int i = 0;				// Local variable used for counting.
			
			do {					// Begin inner loop.
				
				System.out.print("%");
				i++;				// Increment i.
			} while(i <= count2);	// End inner loop.
			System.out.println();	// Skip a line.
			count2++;				// Increment count2.
		} while(count2 < rows2);	// End outer loop.
		
		while(rows3 <= 5) {			// Begin loop
			
			System.out.println("Enter the number of rows in second triangle.(Greater than 5)");
			rows3 = scan.nextInt();	// Scan in integer value for rows.
			scan.nextLine();		// Skip a line to place the cursor.
			if(rows3 <= 5) {		// Error Message.
				
				System.out.println("Error: Number was not large enough.");
			}						// End Error.
		} 							// End loop.
		
		for(int count3 = 0;count3 < rows3;count3++) {	// Begin outer loop.
			
			for(int i = 0;i <= count3;i++) {			// Begin inner loop.
				
				System.out.print("*");
			}											// End inner loop.
			System.out.println();						// Skip a line.
		}												// End outer loop.
		
		System.out.println();							// Skip a line.
		
		for(int count4 = rows3;count4 >= 0;count4--) {	// Begin outer loop for reverse.
			
			for(int i = 0;i < count4;i++) {				// Begin inner loop for reverse.
				
				System.out.print("*");
			}											// End inner loop for reverse.
			System.out.println();						// Skip a line.
		}												// End outer loop for reverse.
		
		System.out.println(myBox);						// Print out the box.
		
		scan.close();									// Close scanner.
	}													// End main.

}														// End Nested.
