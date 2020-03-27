package EX1;

public class Animal {
	
	//atributos
	private int quantPatas;
	private String especie;
	private double pesoAnimal; 
	
	
	//m�todos "construtores"
	public Animal() {
		this(9,"",6.6);
	}
	
	public Animal(int quantPatas, String especie,double pesoAnimal) {
	
		this.quantPatas=quantPatas;
		this.especie=especie;
		this.pesoAnimal=pesoAnimal;
	}
	
	//m�todos get's e set's
	
	public int getquantPatas() {
		return quantPatas;
	}
	
	public void setquantPatas(int quantPatas) {
		this.quantPatas=quantPatas;
	}
	
	
	
	public String getespecie(){
		return especie;
	}
	
	public void setespecie(String especie){
		this.especie=especie;
	}
	
	
	
	public double getpesoAnimal(){
		return pesoAnimal;
	}
	
	public void setpesoAnimal(double pesoAnimal) {
		this.pesoAnimal=pesoAnimal;
	}
	
	//m�todo para apresentar as informa��es
	public void imprimir() {
		System.out.println("Quantidade de patas: "+this.getquantPatas());
		System.out.println("Esp�cie do animal: "+this.getespecie());
		System.out.println("Peso do animal: "+this.getpesoAnimal());
	}
	
	
	

}
