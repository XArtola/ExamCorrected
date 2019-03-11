
package com.zubiri.examCorrection;

public class Adulto extends Persona {

	public Adulto(String _name, int _age, int _weight) throws Exception {
		super(_name, _age, _weight);
		if (_age < 25 || _age > 110)
			throw new Exception("invalid age (max 110)");
		if (!pesoIdeal())
			throw new Exception("invalid weight (max 130)");
	}

	String profesion = "";
	
	public void setProfesion(String _profesion) {
		this.profesion = _profesion;
	}
	
	public String getProfesion()  {
		
		return profesion;
	}
	
	public String tipoLectura() {
		return "Cuento, novela y periodico";
	}

	// polymorphysm situation
	public boolean pesoIdeal() {
		
		return (this.getPeso() <= 130);
			
	}
	
	public static boolean pesoIdeal(int _peso) {
		
		return (_peso <= 130);
			
	}


}
