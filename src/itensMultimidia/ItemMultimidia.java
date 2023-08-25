package itensMultimidia;

public abstract class ItemMultimidia {
//	atributos
	protected String titulo;
	protected String autores;
	protected int edicao;
	protected String idioma;
	protected int tamanho;
	protected String dataPublicacao; //formato correto de data será implementado futuramente
	protected String codigo;
	protected boolean status;
	
//	metodos

//	construtor
	public ItemMultimidia(String titulo, String autores,int edicao,
			String idioma,int tamanho, String dataPublicacao,String codigo,boolean status) {
		this.titulo = titulo;
		this.autores=autores;
		this.edicao=edicao;
		this.idioma=idioma;
		this.tamanho=tamanho;
		this.dataPublicacao=dataPublicacao;
		this.codigo=codigo;
		this.status=status;
	
	}
	
//	getters e setters
	//gets
	public String getTitulo() {
		return titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getStatus() {
		if(this.status)
			return "Emprestado";
		else
			return "Disponível";
	}
	
	//sets
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public void setStatusEmprestado() { //true = material emprestado
		this.status = true;		
	}
	public void setStatusDisponivel() {	//false = material disponível
		this.status = false;
	}
}
	