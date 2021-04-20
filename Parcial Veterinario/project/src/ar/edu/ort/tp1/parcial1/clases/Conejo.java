package ar.edu.ort.tp1.parcial1.clases;

public class Conejo extends Mascota {
	private static final double MULT_ALIMENTACION = 0.022;
	private static final double PORC_DESC_PESO = -2;
	
	
	public Conejo(String nombre, double peso, boolean isVacunado, Estado estado) {
		super(nombre, peso, isVacunado, estado);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void comer(double comida) {
		cambioEstadoPorAlimentacion();
		this.peso += comida * MULT_ALIMENTACION;
		
	}


	@Override
	public void defecar() {
		actualizarPeso(PORC_DESC_PESO);
		
	}
	
	

	//TODO Completar

}
