package models;

public class ExcecaoItemNaoEmprestado extends Exception {
	public ExcecaoItemNaoEmprestado(String mensagem) {
		super(mensagem);
	}
}
