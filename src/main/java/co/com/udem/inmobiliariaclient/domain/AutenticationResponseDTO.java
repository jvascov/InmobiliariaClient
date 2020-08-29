package co.com.udem.inmobiliariaclient.domain;

public class AutenticationResponseDTO {
	
	
	private String username;
	private String token;

	public AutenticationResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AutenticationResponseDTO(String username, String token) {
		super();
		this.username = username;
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
