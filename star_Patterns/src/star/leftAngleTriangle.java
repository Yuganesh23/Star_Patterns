package star;

public class leftAngleTriangle {

	public static void main(String[] args) {

		int rows=5;
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
/*
* 
**
***
****
*****
 */
/*
for (int i = 1; i <= row; i++) {
This outer loop controls the number of rows. It starts from 1 and continues until it reaches the value of row (which is 5). So, it will iterate 5 times.

for (int j = 1; j <= i; j++) {
This inner loop controls how many stars are printed in each row. The number of stars is equal to the value of i:

For i = 1, it prints 1 star.
For i = 2, it prints 2 stars, and so on.
System.out.print("*");
This prints a star (*) on the same line. This will repeat i times in each row.

System.out.println();
After printing the stars for a row, this statement moves the cursor to the next line, ready to print stars for the next row.


 */