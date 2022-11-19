package dominio;

public class Bungalow {
	private String foto;
	private int id;
	private int capacidadMax;
	private String tipo;
	private int precioNoche;
	private String tamanio;
	private String ubicacion;
	private String equipamiento;
	private String descripcion;
	private String disponible;
	private String [] galeria;
	public Bungalow(String foto, int id, int capacidadMax, String tipo, int precioNoche, String tamanio,
			String ubicacion, String equipamiento, String descripcion, String disponible, String[] galeria) {
		this.foto = foto;
		this.id = id;
		this.capacidadMax = capacidadMax;
		this.tipo = tipo;
		this.precioNoche = precioNoche;
		this.tamanio = tamanio;
		this.ubicacion = ubicacion;
		this.equipamiento = equipamiento;
		this.descripcion = descripcion;
		this.disponible = disponible;
		this.galeria = galeria;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacidadMax() {
		return capacidadMax;
	}
	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPrecioNoche() {
		return precioNoche;
	}
	public void setPrecioNoche(int precioNoche) {
		this.precioNoche = precioNoche;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getEquipamiento() {
		return equipamiento;
	}
	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	public String[] getGaleria() {
		return galeria;
	}
	public void setGaleria(String[] galeria) {
		this.galeria = galeria;
	}
	
	
}