package models;

import java.util.ArrayList;

public class Subject {
	//atributos
	private CObserver obs;
	
	//construtor
	public Subject() {
		this.obs = null;
	}
	//metodos
	public CObserver inscrever(Membro membro) {
		return new CObserver(membro);
	}
	public void notificar(Membro membro) {
		this.setObs(inscrever(membro));
		this.obs.update(); //notificar o obs
	}
	
	
	//geters e seters
	public CObserver getObs() {
		return obs;
	}
	public void setObs(CObserver obs) {
		this.obs = obs;
	}
	
}
