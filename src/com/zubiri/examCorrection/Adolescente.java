package com.zubiri.examCorrection;

public class Adolescente extends Persona {
	
	public Adolescente(String _name, int _age, int _weight) throws Exception {
		super(_name, _age, _weight);
		
		if (_age < 14 || _age > 25)
			throw new Exception("invalid age (max 25)");
		if (!pesoIdeal())
			throw new Exception("invalid weight (max 70)");
	}

	String carrera = "";
	
	public void setCarrera(String _carrera) {
		this.carrera = _carrera;
	}
	
	public String getCarrera()  {
		
		return carrera;
	}
	
	public String tipoLectura() {
		return "Cuento y novela";
	}
	
	public boolean pesoIdeal() {
		
		return (this.getPeso() <= 70);
			
	}
		
	// polymorphysm situation
	public static boolean pesoIdeal(int _peso) {
		
		return (_peso <= 80);
			
	}
}
