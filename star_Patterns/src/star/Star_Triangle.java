package star;

public class Star_Triangle {

	public static void main(String[] args) {

		int row = 5;
		
		for (int i =1;i<=row;i++) {
			
			//print space
			for(int j=row-i;j>0;j--) {
				System.out.print(" ");
			}
			
			//print star
			for (int k=1;k<=(2*i-1);k++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}

}
/*
    *
   ***
  *****
 *******
*********
 */


/*For i = 1, it prints 4 spaces (row - 1 = 5 - 1 = 4).
For i = 2, it prints 3 spaces (row - 2 = 3), and so on

*****************************
For i = 1, 1 star is printed (2 * 1 - 1 = 1).
For i = 2, 3 stars are printed (2 * 2 - 1 = 3), and so on*/
