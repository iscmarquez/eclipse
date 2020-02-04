package pack;

import java.util.Arrays;

public class forcompresse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Test 1 ");
		float[] t = {2,4,8,16,32};
		//It's like for each
		for(float u:t) {
			System.out.print(u  + " ");
		}
		
		System.out.println();
		
		
		System.out.print("Test 2 ");
		for (float u :t)
		{
			u = 0;
		}
		
		for(float u : t ) {
			System.out.print(u + " ");
		}
		
System.out.println();
		
		
		System.out.print("Test 3 ");
		float [][] tt = {{1,2},{4,6,8},{8,10},{16},{32,100}};
		
		
		for (float [] u :tt) {
			u = new float[] {100,100,100};
		}
		
		for (float [] u :tt) {
			System.out.print(Arrays.toString(u)+" ");
		}
		
		System.out.println();
		System.out.print("Test 4 ");
		
		for(float[] u : tt)
		{
			System.out.print(Arrays.toString(u) + " ");
		}
	}

}
