
public class Emprestimo {
	// atributos
	private String codigoEmprestimo;
	private String status; //3 possíveis status: "vigente", "atraso" ou "finalizado"
	private Livro livroEmprestado;
	private String dataEmprestimo;
	private String dataDevolucao;
	private Membro emprestante;
	
	//metodos
	
	
	//construtor
	public Emprestimo(String codigoEmprestimo, String status,
			Livro livroEmprestado, Membro emprestante,
			String dataEmprestimo, String dataDevolucao) {
		this.codigoEmprestimo = codigoEmprestimo;
		this.status=status;
		this.livroEmprestado = livroEmprestado;
		this.emprestante = emprestante;
		this.dataEmprestimo=dataEmprestimo;
		this.dataDevolucao=dataDevolucao;
		 //seta o livro como emprestado
		livroEmprestado.setStatusEmprestado();
		//add um livro a contagem de emprestimos do membro
		emprestante.setNumEmprestimos(emprestante.getnumEmprestimos()+1); 
	}
	
	//getters e setters
	//principais gets
	public String getCodigoEmprestimo() {
		return codigoEmprestimo;
	}
	public String getStatus() {
		return status;
	}
	public Livro getLivroEmprestado() {
		return livroEmprestado;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public Membro getEmprestante() {
		return emprestante;
	}
	
	//principais sets
	public void setStatusEmprestimo(String status) {
		this.status=status;
		//implementar a mudança em Membro e Livro quando o emprestimo é finalizado
		// **será implementado futuramente ** 
		if(status == "finalizado") {
			this.livroEmprestado.setStatusDisponivel();
			//diminui em 1 o numero de livros emprestados do membro
			this.emprestante.setNumEmprestimos(this.emprestante.getnumEmprestimos()-1);
		}
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao=dataDevolucao;
	}
}
