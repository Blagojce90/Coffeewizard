package mk.coffeewizard.coffeewizardwebapp.controllers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CerateProfileInf {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
    private Long id; 
	private String fullname;
	private String username;
	private String email;
	private Integer phonenumber;
	private String password;
	private String confrimpassword;
	
	protected CerateProfileInf() {}
	
	public CerateProfileInf(String fullname, String username, String email,Integer phonenumber, String password, String confirmpassword) {
		this.username = username;
		this.fullname = fullname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
		this.confrimpassword = confirmpassword;
		
	}
	
	@Override
	public String toString() {
		return String.format(
				"CerateProfileInf[id='%d', fullname='%s', username='%s']",
				id, fullname, username);
	}
	
	
	public Long  getId() {
		return id;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Integer getPhonenumber() {
		return phonenumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getConfrimpassword() {
		return confrimpassword;
	}
	
	

}
