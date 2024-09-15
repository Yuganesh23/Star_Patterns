package star;

public class rightAngleTriangle {

	public static void main(String[] args) {

		int rows=5;
		
		for(int i=1;i<=rows;i++) {
			
			//print  space
			
			for (int j= rows-i;j>0;j--) {
				
				System.out.print(" ");
			}
			
	           for(int k=1;k<=i;k++) {
				
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
