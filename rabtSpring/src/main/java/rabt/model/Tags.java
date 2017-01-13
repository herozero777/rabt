package rabt.model;

import java.util.HashSet;
import java.util.Set;

public class Tags {
	private int id;
	private String name;
	//private Set<Profile> profile = new HashSet<>(0);
	private Set<Profile> profile;
	
	public int getId() { return this.id; }
	public void setId(int id ) {
		this.id = id;
	}
	
	public String getName() { return name; }
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Profile> getProfile() { return profile; }
	public void setProfile(Set<Profile> profile) {
		this.profile = profile;
	}
	
}
