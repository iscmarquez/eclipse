package pack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nat p = new Nat(5);
		System.out.println("La valeur de p est: " + p.getValeur());
		
		Nat q = new Nat(4);
		System.out.println("La valeur de q est: " + q.getValeur());
		
		Nat r = p.add(q);
		System.out.println("La valeur de r est: " + r.getValeur());

		// ca n'est pas nécessaire déclarer un nouvel objet parce que le méthode add returne un objet du type Nat donc
		//on peut acceder aux méthodes directement 
		System.out.println("La valeur de p + q est: " + p.add(q).getValeur());
		
		Nat v = p.succ();
		System.out.println("La valeur de v est: " + v.getValeur());
		
		
		Paire a = new Paire(8);
		System.out.println("La valeur de a est: " + a.getValeur());
		
		Nat b = a.add(r);
		System.out.println("La valeur de b est: " + b.getValeur());
		
		Paire c = new Paire(2);
		Paire d = a.add(c);
		
		System.out.println("La valeur de d est: " + d.getValeur());
	}

}
