package com.infy.dto;

public class UserDTO {

	
    private Long id;

    private String username;
	
    private String email_id;

    private String password;
    
    private String confirmpassword;

	public UserDTO(Long id, String username, String email, String password, String confirmpassword) {
		super();
		this.id = id;
		this.username = username;
		this.email_id = email_id;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	public UserDTO(){
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", username=" + username + ", email_id=" + email_id + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + "]";
	}
    
    
}
