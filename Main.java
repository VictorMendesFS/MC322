package aula2;

public class Main {

	public static void main(String[] args) {
		//instanciar um obj da classe carro
		//'classe' 'variável' = new 'classe'(atributos de entrada)
		Carro meuCarro = new Carro("vermelho","sedan",2012);
		
		//acessar os atributos do obj usando os getters
		String cor = meuCarro.getCor();
		String modelo  = meuCarro.getModelo();
		int ano = meuCarro.getAno();
		
		//exibindo os atributos
		System.out.println("Cor do carro: " + cor);
		System.out.println("Modelo do carro: " + modelo);
		System.out.println("Ano do carro: "+ano);
		
		//setando novos dados do meuCarro
		meuCarro.setAno(2005);
		meuCarro.setCor("Azul");
		meuCarro.setModelo("Pickup");
		
		//imprimir todos os dados (poderia ser feito por subrotina)
		printAll(meuCarro);
	}
	//poderia ter outro lugar para colocar subrotinas, como uma biblioteca (package)?
	public static void printAll(Carro meuCarro) {
		//acessar os atributos do obj usando os getters
		String cor = meuCarro.getCor();
		String modelo  = meuCarro.getModelo();
		int ano = meuCarro.getAno();
		
		//exibindo os atributos
		System.out.println("******Segundo print*******");
		System.out.println("Cor do carro: " + cor);
		System.out.println("Modelo do carro: " + modelo);
		System.out.println("Ano do carro: "+ano);
				
	}

}
