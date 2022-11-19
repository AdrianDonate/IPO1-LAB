package dominio;

public class Usuario {

	private String dni;
	private String password;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String tlfno;
	private String correo;
	private String rol;
	private String ultimoAcceso;
	
	public Usuario(String dni, String password, String nombre, String apellido1, String apellido2, String tlfno, String correo, 
			String rol, String ultimoAcceso) {
		this.dni = dni;
		this.password = password;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.tlfno = tlfno;
		this.correo = correo;
		this.rol = rol;
		this.ultimoAcceso = ultimoAcceso;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getTlfno() {
		return tlfno;
	}

	public void setTlfno(String tlfno) {
		this.tlfno = tlfno;
	}

	public String getrol() {
		return rol;
	}

	public void setrol(String rol) {
		this.rol = rol;
	}

	public String getUltimoAcceso() {
		return ultimoAcceso;
	}

	public void setUltimoAcceso(String ultimoAcceso) {
		this.ultimoAcceso = ultimoAcceso;
	}

	public Usuario() {}
	
	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
