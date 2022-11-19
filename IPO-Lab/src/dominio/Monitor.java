package dominio;

public class Monitor {
	
	private String nombre;
	private String apellidos;
	private String tlfn;
	private String correo;
	private String idiomas;
	private String formacion;
	private String imagen;
	
	public Monitor(String nombre, String apellidos, String tlfn, String correo, String idiomas, String formacion, String imagen) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tlfn = tlfn;
		this.correo = correo;
		this.idiomas = idiomas;
		this.formacion = formacion;
		this.imagen= imagen;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTlfn() {
		return tlfn;
	}

	public void setTlfn(String tlfn) {
		this.tlfn = tlfn;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public String getFormacion() {
		return formacion;
	}

	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}
	
	
	
	
}
