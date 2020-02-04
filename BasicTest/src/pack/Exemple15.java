package pack;

import java.util.Arrays;

public class Exemple15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5};
		int [] b = {1,2,3,4,5};
		int[] c;
		c =a;
		System.out.println("a==b compare address en cas de tableaux " + (a==b));
		System.out.println("a==c comme compare addres le deux signalent la meme address " + (a==c));
		System.out.println("a equals c equals travail comme == pour tableaux" + a.equals(b));
		System.out.println("a equals c"  + a.equals(c));
		System.out.println("Arrays a, b seulment arrays.equals compare le contenu" + Arrays.equals(a, b));
		System.out.println("Arrays a, c " + Arrays.equals(a, c));
		
		

	}

}
