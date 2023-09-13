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
		// coloca pessoa como reservante
		itemReservado.setReservante(reservante); //por enquanto cada item só suporta um reservante
		//imprime a data que o material estará disponível
		System.out.println("Material Reservado para o dia: "
				+ itemReservado.getHistoricoEmprestimos().
				get(itemReservado.getHistoricoEmprestimos().size()-1).getDataDevolucao() + "\n");

	}

	//metodos

	public void acrescerContadorDeReservas(ItemMultimidia itemReservado) {
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


}
