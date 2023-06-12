package test;

public class multiDimensionalArray {

	public static void main(String[] args) {

		int[][] cord = { { 10, 20, 30, 40 }, { 50, 60, 70 }, { 80, 90, 100 } };
		
		System.out.println("Length of the Array is" + " " + cord.length);

		
		
		for (int i = 0; i < cord.length; i++) {
			
			
			for(int j=0;j<i; j++) {
				
				System.out.println(cord[i] [j]);
				
				//System.out.println("Element of the Index " + i + " " + j +" " + cord[i][j]);
				
			}
			
		}


	}
		
}
