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
@Entity
@Table(name="contacttypetbl")
public class ContactType {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="contacttype")
	private String contactType;

	public ContactType() {
		contactType = "";
	}

	public ContactType(String contactType) {
		this.contactType = contactType;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public String getContactType() {
		return contactType;
	}

	public String toString() {
		return this.id+".\t"+this.contactType;
	}

}