package dominio;

public class Parcela {
	private String foto;
	private int id;
	private String nombre;
	private int precioNoche;
	private String caracteristicas;
	private String tamanio;
	private String ubicacion;
	private  String descripcion;
	private String disponible;
	private String [] galeria;



	public Parcela(String foto, int id, String nombre, int precioNoche, String caracteristicas, String tamanio,
			String ubicacion, String descripcion, String disponible, String[] galeria) {
		this.foto = foto;
		this.id = id;
		this.nombre = nombre;
		this.precioNoche = precioNoche;
		this.caracteristicas = caracteristicas;
		this.tamanio = tamanio;
		this.ubicacion = ubicacion;
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



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getPrecioNoche() {
		return precioNoche;
	}



	public void setPrecioNoche(int precioNoche) {
		this.precioNoche = precioNoche;
	}



	public String getCaracteristicas() {
		return caracteristicas;
	}



	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
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



	public boolean estaDisponible() {
		if (this.disponible=="Disponible") 
			return true;
		else 
			return false;
	}
	
}
