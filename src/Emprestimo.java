
public class Emprestimo {
	// atributos
	private String codigoEmprestimo;
	private String status;
	private String codigoLivro;
	private String dataEmprestimo;
	private String dataDevolucao;
	private String idEmprestante;
	
	//metodos
	
	
	//construtor
	public Emprestimo(String codigoEmprestimo, String status,
			String codigoLivro, String idEmprestante,
			String dataEmprestimo, String dataDevolucao) {
		this.codigoEmprestimo = codigoEmprestimo;
		this.status=status;
		this.codigoLivro=codigoLivro;
		this.dataDevolucao=dataDevolucao;
		this.idEmprestante=idEmprestante;
		this.dataEmprestimo=dataEmprestimo;
	}
	
	//getters e setters
	//principais gets
	public String getCodigoEmprestimo() {
		return codigoEmprestimo;
	}
	public String getStatus() {
		return status;
	}
	public String getCodigoLivro() {
		return codigoLivro;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public String getIdEmprestante() {
		return idEmprestante;
	}
	
	//principais sets
	public void setStatus(String status) {
		this.status=status;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao=dataDevolucao;
	}
	
}
