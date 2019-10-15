package com.hibernate.lexter;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
@Embeddable
public class Name {

	@Column(name="lastname")
	private String lastName;
	@Column(name="firstname")
	private String firstName;
	@Column(name="midname")
	private String midName = "";
	@Column(name="suffix")
	private String suffix = "";

	public Name() {
		
	}

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Name(String firstName, String lastName, String midName, String suffix) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.midName = midName;
		this.suffix = suffix;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}
	public String getMidName() {
		return midName;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getSuffix() {
		return suffix;
	}

	public String toString() {
		return lastName+" "+firstName+" "+midName+" "+suffix;
	}

}