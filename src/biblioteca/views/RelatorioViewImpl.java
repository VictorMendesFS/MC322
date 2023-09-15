package views;

import controllers.RelatorioController;

public class RelatorioViewImpl implements RelatorioView{
	private RelatorioController relatorioController;
	
	public RelatorioViewImpl(RelatorioController controller) {
		this.relatorioController=controller;
	}
}
