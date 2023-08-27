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
	protected boolean reservado;
	
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
		this.reservado=false;
	}
	
//	getters e setters
	//gets
	public String getTitulo() {
		return titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getStatusString() {
		if(this.status)//true = material emprestado ou reservado
			return "Indisponível";
		else
			return "Disponível";
	}
	public boolean getStatusBool() {
		return this.status;
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
	public void setStatusIndispoivel() { //true = material emprestado
		this.status = true;		
	}
	public void setStatusDisponivel() {	//false = material disponível
		this.status = false;
	}
}
	