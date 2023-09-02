package procedimentos;

import java.util.ArrayList;
import java.util.List;

import itensMultimidia.*;
import pessoas.*;

public class ArmazenamentoBiblioteca {
	//esta é a classe responsavel por centralizar todos os objetos instanciados na bilbioteca
	
	//atributos
	//instanciação de itens multimídia em listas
		private static List<LivroFisico> livrosFisicos = new ArrayList<>();
		private static List<LivroDigital> livrosDigitais = new ArrayList<>();
		private static List<DVD> dvds = new ArrayList<>();
		private static List<CD> cds = new ArrayList<>();
		private static List<OutroRecursoMultimidia> outrosRecursos = new ArrayList<>();

		//instanciação de pessoas em listas
		private static List<EstudanteGrad> estudantesGrad = new ArrayList<>();
		private static List<EstudantePos> estudantesPos = new ArrayList<>();
		private static List<Professor> professores = new ArrayList<>();
		private static List<Funcionario> funcionarios = new ArrayList<>();
		
		
		
		//geters e seters
		
		public static List<LivroFisico> getLivrosFisicos() {
			return livrosFisicos;
		}
		public static List<LivroDigital> getLivrosDigitais() {
			return livrosDigitais;
		}
		public static List<DVD> getDvds() {
			return dvds;
		}
		public static List<CD> getCds() {
			return cds;
		}
		public static List<OutroRecursoMultimidia> getOutrosRecursos() {
			return outrosRecursos;
		}
		public static List<EstudanteGrad> getEstudantesGrad() {
			return estudantesGrad;
		}
		public static List<EstudantePos> getEstudantesPos() {
			return estudantesPos;
		}
		public static List<Professor> getProfessores() {
			return professores;
		}
		public static List<Funcionario> getFuncionarios() {
			return funcionarios;
		}
		public static void setLivrosFisicos(List<LivroFisico> livrosFisicos) {
			ArmazenamentoBiblioteca.livrosFisicos = livrosFisicos;
		}
		public static void setLivrosDigitais(List<LivroDigital> livrosDigitais) {
			ArmazenamentoBiblioteca.livrosDigitais = livrosDigitais;
		}
		public static void setDvds(List<DVD> dvds) {
			ArmazenamentoBiblioteca.dvds = dvds;
		}
		public static void setCds(List<CD> cds) {
			ArmazenamentoBiblioteca.cds = cds;
		}
		public static void setOutrosRecursos(List<OutroRecursoMultimidia> outrosRecursos) {
			ArmazenamentoBiblioteca.outrosRecursos = outrosRecursos;
		}
		public static void setEstudantesGrad(List<EstudanteGrad> estudantesGrad) {
			ArmazenamentoBiblioteca.estudantesGrad = estudantesGrad;
		}
		public static void setEstudantesPos(List<EstudantePos> estudantesPos) {
			ArmazenamentoBiblioteca.estudantesPos = estudantesPos;
		}
		public static void setProfessores(List<Professor> professores) {
			ArmazenamentoBiblioteca.professores = professores;
		}
		public static void setFuncionarios(List<Funcionario> funcionarios) {
			ArmazenamentoBiblioteca.funcionarios = funcionarios;
		}

	

}
