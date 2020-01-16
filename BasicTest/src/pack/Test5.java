package pack;

import java.util.Scanner;


public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean isPremier = false;
		for(int i = 2; i < a; i++)
		{
			if(a%i != 0)
			{
				isPremier = true;
				break;
			}
		}
		
		if(isPremier)
			System.out.println(a + " est premier");
		else
			System.out.println(a + " n'est pas premier");
	}

}
