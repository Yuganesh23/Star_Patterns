package star;

public class diamond {

	public static void main(String[] args) {

	     int row = 5; // Number of rows for the upper half of the diamond

	        // Upper half of the diamond
	        for (int i = 1; i <= row; i++) {
	            // Print spaces
	            for (int j = row - i; j > 0; j--) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                //System.out.print(i);
	            	 System.out.print((char)(i + 64));
	            }

	            // Move to the next line
	            System.out.println();
	        }

	        // Lower half of the diamond
	        for (int i = row - 1; i >= 1; i--) {
	            // Print spaces
	            for (int j = row - i; j > 0; j--) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print(i);
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    }
	}
/*
    A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE
 4444444
  33333
   222
    1
 */
/*
 Upper Half of the Diamond:
for (int i = 1; i <= row; i++) {
This loop controls the rows of the upper half of the diamond. It runs from i = 1 to i = 5.

for (int j = row - i; j > 0; j--) {
This inner loop prints spaces to align the stars in the center. The number of spaces decreases as i increases.

for (int k = 1; k <= (2 * i - 1); k++) {
This inner loop prints the stars. The number of stars increases as i increases:

For i = 1, it prints 1 star.
For i = 2, it prints 3 stars, and so on. The pattern for stars is based on (2 * i - 1).
System.out.println();
Moves the cursor to the next line after printing the spaces and stars for the current row.

Lower Half of the Diamond:
for (int i = row - 1; i >= 1; i--) {
This loop handles the rows for the lower half of the diamond. It starts from i = 4 and decreases until i = 1. It mirrors the upper half.

for (int j = row - i; j > 0; j--) {
This inner loop prints spaces. The number of spaces increases as i decreases to create the inverted part of the diamond.

for (int k = 1; k <= (2 * i - 1); k++) {
This inner loop prints stars. The number of stars decreases as i decreases:

For i = 4, it prints 7 stars.
For i = 3, it prints 5 stars, and so on.
System.out.println();
After printing the stars and spaces, the cursor moves to the next line to continue with the next row of the lower half.
 */
 
