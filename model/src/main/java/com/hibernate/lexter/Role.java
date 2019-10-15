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
@Table(name="roletbl")
public class Role {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "rolename")
	private String role;

	public Role() {
		role = "";
	}

	public Role(String role) {
		this.role = role;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public String getRole() {
		return role;
	}

	public String toString() {
		return this.role;
	}

	// @Override
	// public boolean equals(Object obj) {
	// 	System.out.println("Comparing");
	// 	Role rl = (Role) obj;
	// 	return rl.role.equals(this.role);
	// }

	@Override
	public int hashCode() {
		return (int) role.hashCode();
	}

}