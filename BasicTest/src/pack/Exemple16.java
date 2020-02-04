package pack;


public class Exemple16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Bonjour";
		String b = "Bonjour";
		String c ;
		c =a ;
		String d = new String("Bonjour");
		
		System.out.println("a==b" +(a==b));
		System.out.println("a==c"+(a==c));
		System.out.println("a==d"+(a==d));
		System.out.println("a equals b "+a.contentEquals(b));
		System.out.println("a equals c "+a.contentEquals(c));
		System.out.println("a equals d "+a.contentEquals(d));
		
		
	}

}
