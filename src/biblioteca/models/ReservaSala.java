package models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ReservaSala {
	//atributos
	private LocalDate dataReserva;
	private LocalTime horaInicio;
	private LocalTime horaFim;
	private StatusReserva status;

	//construtor
	public ReservaSala(LocalDate dataReserva, LocalTime horaInicio, LocalTime horaFim) {
		try {
			if(this.status == StatusReserva.CONFIRMADA || this.status == StatusReserva.PENDENTE) {
				throw new ExcecaoSalaReservada("Sala indisponível");
			}
		} catch(ExcecaoSalaReservada e) {
			System.err.println("Erro ao reservar sala: "+ 
					e.getMessage());
		}
		this.dataReserva = dataReserva;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}

	//enum
	public enum StatusReserva{
		PENDENTE,CONFIRMADA,CANCELADA;
	}
	//static nested classes
	public static class SalaIndividual{
		//atributos
		private boolean computadorDisponivel;
		private int numSala;
		//construtor
		public SalaIndividual(boolean computadorDisponivel, int numSala) {
			super();
			this.computadorDisponivel = computadorDisponivel;
			this.numSala = numSala;
		}
		public boolean isComputadorDisponivel() {
			return computadorDisponivel;
		}
		public int getNumSala() {
			return numSala;
		}
		public void setComputadorDisponivel(boolean computadorDisponivel) {
			this.computadorDisponivel = computadorDisponivel;
		}
		public void setNumSala(int numSala) {
			this.numSala = numSala;
		}
	}
	public static class SalaGrupo{
		//atributos
		private int capacidadeMax;
		private int pessoasNaSala;
		private boolean dispApresentacao;
		//construtor 
		public SalaGrupo(int capacidadeMax, boolean dispApresentacao,
				int pessoasNaSala) {
			try {
				if(pessoasNaSala>capacidadeMax)
					throw new ExcecaoCapacidadeMaximaSala("Capacidade de sala excedida");
				
			} catch(ExcecaoCapacidadeMaximaSala e){
				System.err.println("Erro na administração da sala" + 
						e.getMessage());
			}
			this.capacidadeMax = capacidadeMax;
			this.dispApresentacao = dispApresentacao;
		}
		public int getCapacidadeMax() {
			return capacidadeMax;
		}
		public boolean isDispApresentacao() {
			return dispApresentacao;
		}
		public void setCapacidadeMax(int capacidadeMax) {
			this.capacidadeMax = capacidadeMax;
		}
		public void setDispApresentacao(boolean dispApresentacao) {
			this.dispApresentacao = dispApresentacao;
		}
	}
	public static class SalaSilenciosa{
		//atributos
		private int numAssentos;
		private boolean possuiCabinesIndividuais;
		//construtor 
		public SalaSilenciosa(int numAssentos, boolean possuiCabinesIndividuais) {
			super();
			this.numAssentos = numAssentos;
			this.possuiCabinesIndividuais = possuiCabinesIndividuais;
		}
		public int getNumAssentos() {
			return numAssentos;
		}
		public boolean isPossuiCabinesIndividuais() {
			return possuiCabinesIndividuais;
		}
		public void setNumAssentos(int numAssentos) {
			this.numAssentos = numAssentos;
		}
		public void setPossuiCabinesIndividuais(boolean possuiCabinesIndividuais) {
			this.possuiCabinesIndividuais = possuiCabinesIndividuais;
		}
	}
	public static class SalaMultimidia{
		//atributos
		private List<Multimidia> equipamentosDisponiveis = new ArrayList<>();
		//construtor

		public SalaMultimidia(List<Multimidia> equipamentosDisponiveis) {
			super();
			this.equipamentosDisponiveis = equipamentosDisponiveis;
		}
		//get e set

		public List<Multimidia> getEquipamentosDisponiveis() {
			return equipamentosDisponiveis;
		}

		public void setEquipamentosDisponiveis(List<Multimidia> equipamentosDisponiveis) {
			this.equipamentosDisponiveis = equipamentosDisponiveis;
		}
	}
	//getters e setters
	public LocalDate getDataReserva() {
		return dataReserva;
	}
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public LocalTime getHoraFim() {
		return horaFim;
	}
	public StatusReserva getStatus() {
		return status;
	}
	public void setDataReserva(LocalDate dataReserva) {
		this.dataReserva = dataReserva;
	}
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}
	public void setStatus(StatusReserva status) {
		this.status = status;
	}

}
