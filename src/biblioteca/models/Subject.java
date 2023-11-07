package models;

import java.util.ArrayList;

public class Subject {
	//atributos
	private CObservador obs;
	
	//construtor
	public Subject() {
		this.obs = null;
	}
	//metodos
	public CObservador inscrever(Membro membro) {
		return new CObservador(membro);
	}
	public void notificar(Membro membro) {
		this.setObs(inscrever(membro));
		this.obs.update(); //notificar o obs
	}
	
	
	//geters e seters
	public CObservador getObs() {
		return obs;
	}
	public void setObs(CObservador obs) {
		this.obs = obs;
	}
	
}
