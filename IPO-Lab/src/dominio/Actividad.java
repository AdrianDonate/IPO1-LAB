package dominio;

public class Actividad {
	private String id;
	private String monitor;
	private String horario;
	private int cupoMin;
	private int cupoMax;
	private int precioH;
	private String area;
	private String materiales;
	private String foto;
	
	public Actividad(String id, String monitor, String horario, int cupoMin, int cupoMax, int precioH, String area,
			String materiales, String foto) {
		this.id = id;
		this.monitor = monitor;
		this.horario = horario;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.precioH = precioH;
		this.area = area;
		this.materiales = materiales;
		this.foto = foto;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getCupoMin() {
		return cupoMin;
	}
	public void setCupoMin(int cupoMin) {
		this.cupoMin = cupoMin;
	}
	public int getCupoMax() {
		return cupoMax;
	}
	public void setCupoMax(int cupoMax) {
		this.cupoMax = cupoMax;
	}
	public int getPrecioH() {
		return precioH;
	}
	public void setPrecioH(int precioH) {
		this.precioH = precioH;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMateriales() {
		return materiales;
	}
	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public boolean verDisponibilidad() {
		if (this.cupoMin==this.cupoMax) {
			return false;
		}else {
			return true;
		}
	}

	
	
	
}
