package models;

public interface InterfaceMembro {
	//exemplo de Interface segregation principle
    String getNome();
    String getIdentificacao();
    int getLimiteEmprestimo();
    int getPrazoEmprestimo();
    double getMultaAtraso();
}