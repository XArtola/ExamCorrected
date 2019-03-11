package com.zubiri.examCorrection;

public abstract class Persona {

	private String nombre = "";
	private int edad = 0;
	private int peso = 0;
	
	public static int numberOfAlex = 0;

	public Persona(String name, int age, int weight) throws Exception {
		setNombre(name);
		setEdad(age);
		setPeso(weight);
	}


	public String getNombre() {
		 return nombre;
	 }
	 
	 public void setNombre(String _nombre) {
		 this.nombre = _nombre;
		if (nombre.compareToIgnoreCase("alex") == 0)
			numberOfAlex++;

	 }
	 
	 public int getEdad() {
		 return edad;
	 }
	 
	 public void setEdad(int age) throws Exception {
			
		   if (age > 110 || age <= 0) {
				throw new Exception("The age should be between 1 and 110");
			} 
		   
		   this.edad = age;
		
		}

	public int getPeso() {
		 return peso;
	 }
	public void setPeso(int _weight) throws Exception {
			
		    if (pesoIdeal(_weight)) 
				this.peso = _weight;
	
	}
	
	
	public static boolean pesoIdeal(int weigth) throws Exception {
		
		if (weigth > 130 || weigth <= 0) 
			throw new Exception("The weigth should be between 1 and 130");
		
		
		return true;	
	}

	public boolean esMayorDeEdad() {

		return (this.edad > 18);		
	}

	public abstract String tipoLectura();

}
