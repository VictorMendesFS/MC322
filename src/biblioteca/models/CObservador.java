package models;

public class CObservador {
	//atributo
	private Membro membro; //cada membro é um observador
	
	//construtor
	public CObservador(Membro membro) {
		this.membro = membro;
	};
	
	//metodos
	public void update() { // notificar os usuários que um item foi devolvido
		//implementar em membro a notificação
		//this.membro.
	};
}
