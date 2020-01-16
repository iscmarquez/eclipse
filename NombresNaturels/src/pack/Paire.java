package pack;

public class Paire extends Nat {

	public Paire(int x) {
		super(x);
		if(valeur%2 != 0)
		{
			valeur = valeur +1;
		}
	}
	
	public Paire add (Paire x) {
		return new Paire(valeur + x.valeur);
	}
}
