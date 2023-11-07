package models;

public class CSingleton {
	// atributos
	private CSingleton instance = null;

	// construtor
	private CSingleton() {
	};

	// função de instanciação
	public CSingleton InstanceCSingleton() {
		if (instance == null) { // garante uma instancia
			instance = new CSingleton();
		}
		return instance;
	}
	
	// metodos
	public CSingleton getInstance() {
		return instance;
	}

	public void setInstance(CSingleton instance) {
		this.instance = instance;
	}

	
}
