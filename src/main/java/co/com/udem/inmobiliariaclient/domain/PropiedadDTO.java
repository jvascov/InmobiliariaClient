package co.com.udem.inmobiliariaclient.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class PropiedadDTO {

	private Long id;
	private Long area;
	private int habitaciones;
	private int banos;
	private String contrato;
	private Long valor;

	@Autowired
	private UsuarioDTO usuarioDTO;

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

	public PropiedadDTO(Long id, Long area, int habitaciones, int banos, String contrato, Long valor,
			UsuarioDTO usuarioDTO) {
		super();
		this.id = id;
		this.area = area;
		this.habitaciones = habitaciones;
		this.banos = banos;
		this.contrato = contrato;
		this.valor = valor;
		this.usuarioDTO = usuarioDTO;
	}

	public PropiedadDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public int getBanos() {
		return banos;
	}

	public void setBanos(int banos) {
		this.banos = banos;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

}
