package models;

public class CObserver {
	//atributo
	private Membro membro; //cada membro é um observador
	
	//construtor
	public CObserver(Membro membro) {
		this.membro = membro;
	};
	
	//metodos
	public void update() { // notificar os usuários que um item foi devolvido
		//implementar a notificação do membro
	};
}
