package aula2;

public class Carro {
	//Atributos da classe - privados (nao visiveis a outras classes)
	private String cor;
	private String modelo;
	private int ano;
	
	//Métodos da classe - como ela interage com outras classes, além de seu comportamento 
	//dos seus atributos
	public void ligar() {
		System.out.println("Carro ligado!");
	}
	public void desligar() {
		System.out.println("Carro desligado!");
	}
	
	//construtor da classe (retorna uma instancia do obj da classe Carro)
	public Carro(String cor, String modelo, int ano) {
		this.cor = cor; //é possível usar o setCor para instanciar um novo obj?
		this.modelo = modelo;
		this.ano = ano;
	}
	
	//Setters e getters para acessar os atributos privados
	
	//getCor: retorna a string da cor do carro
	public String getCor() {
		return cor;
	}
	//serCor: recebe a string com a cor do carro
	public void setCor(String cor) {
		this.cor = cor;
	}
	//getModelo
	public String getModelo() {
		return modelo;
	}
	//setModelo
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//getAno
	public int getAno() {
		return ano;
	}
	//setAno
	public void setAno(int ano) {
		this.ano=ano;
	}
	
}