package models;

public class CSingleton {
	//esta classe garante que a classe ArmazenamentoBiblioteca 
	//seja instanciada uma unica vez
	
	// atributos
	private ArmazenamentoBiblioteca instance = null;

	// construtor
	private CSingleton() {
	};

	// função de instanciação
	public ArmazenamentoBiblioteca InstanceCSingleton() {
		if (instance == null) { // garante uma instancia
			instance = new ArmazenamentoBiblioteca();
		}
		return instance;
	}
	
	// metodos
	public ArmazenamentoBiblioteca getInstance() {
		return instance;
	}

	public void setInstance(ArmazenamentoBiblioteca instance) {
		this.instance = instance;
	}

	
}
