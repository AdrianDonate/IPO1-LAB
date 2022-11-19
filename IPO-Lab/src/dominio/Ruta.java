package dominio;

public class Ruta {
	String id;
	String horaI;
	String horaF;
	String [] monitor;
	String puntoEncuentro;
	String cupoMin;
	String cupoMax;
	String dificultad;
	String equipamiento;
	String decripcion;
	public Ruta(String id, String horaI, String horaF, String[] monitor, String puntoEncuentro, String cupoMin,
			String cupoMax, String dificultad, String equipamiento, String decripcion) {
		super();
		this.id = id;
		this.horaI = horaI;
		this.horaF = horaF;
		this.monitor = monitor;
		this.puntoEncuentro = puntoEncuentro;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.dificultad = dificultad;
		this.equipamiento = equipamiento;
		this.decripcion = decripcion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHoraI() {
		return horaI;
	}
	public void setHoraI(String horaI) {
		this.horaI = horaI;
	}
	public String getHoraF() {
		return horaF;
	}
	public void setHoraF(String horaF) {
		this.horaF = horaF;
	}
	public String[] getMonitor() {
		return monitor;
	}
	public void setMonitor(String[] monitor) {
		this.monitor = monitor;
	}
	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}
	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}
	public String getCupoMin() {
		return cupoMin;
	}
	public void setCupoMin(String cupoMin) {
		this.cupoMin = cupoMin;
	}
	public String getCupoMax() {
		return cupoMax;
	}
	public void setCupoMax(String cupoMax) {
		this.cupoMax = cupoMax;
	}
	public String getDificultad() {
		return dificultad;
	}
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	public String getEquipamiento() {
		return equipamiento;
	}
	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}
	public String getDecripcion() {
		return decripcion;
	}
	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}
	
}
