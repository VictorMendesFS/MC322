package models;

public class Reserva {
	//atributos
	private Membro reservante;
	private ItemMultimidia itemReservado;

	public Reserva(Membro reservante, ItemMultimidia itemReservado) {
		// set item para reservado
		itemReservado.setReservado(true);
		// add uma reserva ao contador do tipo especifico
		itemReservado.numReservas++;
		// add uma reserva ao contador do tipo de item
		acrescerContadorDeReservas(itemReservado);
		// coloca pessoa como reservante na fila do item
		itemReservado.getReservas().add(this);
		//add reserva a lista da bilbioteca
		ArmazenamentoBiblioteca.getReservasVigentes().add(this);
		//imprime a data que o material estará disponível
		System.out.println("Material Reservado para o dia: "
				+ itemReservado.getHistoricoEmprestimos().
				get(itemReservado.getHistoricoEmprestimos().size()-1).getDataDevolucao() + "\n");
	}

	//metodos
	//MAIS ATRIBUTOS E LÓGICAS SERÃO IMPLEMENTADOS FUTURAMENTE
	//add ao contador de reservas de cada item
	public static void acrescerContadorDeReservas(ItemMultimidia itemReservado) {
		if (itemReservado instanceof LivroFisico)
			LivroFisico.setCONTADOR_RESERVAS(LivroFisico.getCONTADOR_RESERVAS() + 1);
		if (itemReservado instanceof LivroDigital)
			LivroDigital.setCONTADOR_RESERVAS(LivroDigital.getCONTADOR_RESERVAS() + 1);
		if (itemReservado instanceof CD)
			CD.setCONTADOR_RESERVAS(CD.getCONTADOR_RESERVAS() + 1);
		if (itemReservado instanceof DVD)
			DVD.setCONTADOR_RESERVAS(DVD.getCONTADOR_RESERVAS() + 1);
		if (itemReservado instanceof OutroRecursoMultimidia)
			OutroRecursoMultimidia.setCONTADOR_RESERVAS(OutroRecursoMultimidia.getCONTADOR_RESERVAS() + 1);		
	}

	public Membro getReservante() {
		return reservante;
	}

	public ItemMultimidia getItemReservado() {
		return itemReservado;
	}

	public void setReservante(Membro reservante) {
		this.reservante = reservante;
	}

	public void setItemReservado(ItemMultimidia itemReservado) {
		this.itemReservado = itemReservado;
	}


}
