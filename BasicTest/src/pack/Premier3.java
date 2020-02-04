package pack;

import java.util.Scanner;

public class Premier3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc = new Scanner(System.in);

				int a = sc.nextInt();

				boolean diviseurTrouve = true;

				if(a < 1)
				{
					System.out.println("Nombre n'est pas premier");
						
				}
				else
				{
					int i;
				for( i = 2; (i <= Math.sqrt(a)  && (a%i !=0)); i++) {}
				
				if(i<Math.sqrt(a) )
					System.out.println(a + " n'est pas premier");
				else
					System.out.println(a + " est premier");
				}
	}

}
