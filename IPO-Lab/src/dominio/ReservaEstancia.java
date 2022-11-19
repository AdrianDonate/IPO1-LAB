package dominio;

public class ReservaEstancia {
	private String id;
	private String fechaEntrada;
	private String fechaSalida;
	private String reservadoA;
	private String tlfno;
	private String mail;
	private int ocupantes;
	private String horaEntrada;
	private String horaSalida;
	private String [] extras;
	public ReservaEstancia(String id, String fechaEntrada, String fechaSalida, String reservadoA, String tlfno,
			String mail, int ocupantes, String horaEntrada, String horaSalida, String[] extras) {
		super();
		this.id = id;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.reservadoA = reservadoA;
		this.tlfno = tlfno;
		this.mail = mail;
		this.ocupantes = ocupantes;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.extras = extras;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public String getReservadoA() {
		return reservadoA;
	}
	public void setReservadoA(String reservadoA) {
		this.reservadoA = reservadoA;
	}
	public String getTlfno() {
		return tlfno;
	}
	public void setTlfno(String tlfno) {
		this.tlfno = tlfno;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getOcupantes() {
		return ocupantes;
	}
	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}
	public String getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public String getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
	public String[] getExtras() {
		return extras;
	}
	public void setExtras(String[] extras) {
		this.extras = extras;
	}
	
}
