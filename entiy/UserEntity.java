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
	    private String email;
		@Column(name="password",length=225)
	    private String password;
		public UserEntity(Long id, String username, String email, String password) {
			super();
			this.id = id;
			this.username = username;
			this.email = email;
			this.password = password;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "UserEntity [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
		}
		
}
