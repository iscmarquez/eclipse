package pack;

import java.util.Scanner;

//override redefine le comportmente
//overload le comportement est different mais la quantite de parametres est different

public class Test5 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

	
		if(a < 1)
		{
			System.out.println("Nombre n'est pas premier");
				
		}
		else
		{
			boolean diviseurTrouve = true;

		for(int i = 2; (i < a && diviseurTrouve); i++)
			if(a%i == 0)
				diviseurTrouve = false;
		if(diviseurTrouve)
			System.out.println(a + " est premier");
		else
			System.out.println(a + " n'est pas premier");
		}
	}



}
