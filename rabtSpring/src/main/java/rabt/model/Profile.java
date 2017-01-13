package rabt.model;

import java.util.HashSet;
import java.util.Set;

public class Profile {
	//private User u_id; implement after testing
	private int u_id;
	private String gender;
	private String email;
	private String school;
	private String aboutme;
	//private Set<Tags> tags = new HashSet<>(0);
	private Set<Tags> tags;
	
	public int getU_id() { return u_id; }
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	
	public String getGender() { return gender; }
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() { return email; }
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSchool() { return school; }
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getAboutme() { return aboutme; }
	public void setAboutme(String aboutme) {
		this.aboutme = aboutme;
	}
	
	public Set<Tags> getTags() { return tags; }
	public void setTags(Set<Tags> tags) {
		this.tags = tags;
	}
	
}
