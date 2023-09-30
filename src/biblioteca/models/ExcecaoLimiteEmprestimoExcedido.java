package models;

public class ExcecaoLimiteEmprestimoExcedido extends Exception {
	public ExcecaoLimiteEmprestimoExcedido(String mensagem) {
		super(mensagem); //emite uma mensagem como tratamento da exceção
	}
}
