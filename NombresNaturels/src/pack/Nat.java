package pack;

public class Nat {
	// structure intern
	protected int valeur;
	
	//constructteur
	public Nat(int x) {
		if(x >= 0){
			valeur = x;
		}
		else {
			System.out.println("Les nombres naturels ne peuvent pas être négatifs");
			System.out.println(x + " convertir en " + (-1*x));
			valeur = (-1* x);
		}
	}
	
	public Nat add (Nat x)
	{
		//un nouveau objet du type Nat dont la valeur est l'addition de la valeur
		//de l'objet current (this) et la valeur de x.
		return new Nat(this.valeur + x.valeur);
	}
 
	public int getValeur() {
		return this.valeur;
	}
	
	public Nat succ()
	{
		return new Nat(valeur +1);
	}
}
