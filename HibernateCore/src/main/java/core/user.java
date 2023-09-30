package core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_data")
public class user {
   @Id
   @Column(name="User_id")
	private int id;
   @Column(name="Name")
	private String name;
   @Column(name="Contact")
	private long contact;
   
   
   
public user() {  // default constructor
	super();
	// TODO Auto-generated constructor stub
}
public user(int id, String name, long contact) {  // field constructor
	super();
	this.id = id;
	this.name = name;
	this.contact = contact;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "user [getId()=" + getId() + ", getName()=" + getName() + ", getContact()=" + getContact() + "]";
}
	

}
