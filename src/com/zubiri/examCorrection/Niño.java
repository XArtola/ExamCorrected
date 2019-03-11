package com.zubiri.examCorrection;

public class Niño extends Persona {

	public Niño(String _name, int _age, int _weight) throws Exception {
		
		super(_name, _age, _weight);
		
		if (_age < 0 || _age > 14)
			throw new Exception("invalid age (max 110)");
		if (!pesoIdeal())
			throw new Exception("invalid weight (max 130)");
	}

	public String tipoLectura() {
			return "Cuento";
	}

	public boolean pesoIdeal() {
		
		return (this.getPeso() <= 50);
			
	}
    //polymorphysm situation
	public static boolean pesoIdeal(int _peso) {
		
		return (_peso <= 50);
			
	}
}
