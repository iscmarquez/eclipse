package pack;

import java.util.Arrays;

public class println {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] tc = {'a','b','c'};
		System.out.println("\nprintln tc " + tc);
		System.out.print("\nprint tc " + tc);
		System.out.println("\nprintl tc.toString()" + tc.toString());
		
		System.out.println("\nArrays.toString(tc) "+ Arrays.toString(tc));
		System.out.println(new String(tc));
		
		
	
	}

}
