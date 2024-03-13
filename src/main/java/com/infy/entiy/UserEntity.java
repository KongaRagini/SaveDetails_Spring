package com.infy.entiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productlogin")
public class UserEntity {

	
	
		
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="id",length=45)
	    private Long id;
		@Column(name="username",length=225)
	    private String username;
		@Column(name="email_id",length=225)
	    private String email_id;
		@Column(name="password",length=225)
	    private String password;
		@Column(name="confirmpassword",length=225)
	    private String confirmpassword;
	
		
		public UserEntity(Long id, String username, String email_id, String password, String confirmpassword) {
			super();
			this.id = id;
			this.username = username;
			this.email_id = email_id;
			this.password = password;
			this.confirmpassword = confirmpassword;
		}

		
		public UserEntity(){
			
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
			return "UserEntity [id=" + id + ", username=" + username + ", email_id=" + email_id + ", password=" + password
					+ ", confirmpassword=" + confirmpassword + "]";
		}
		
}
