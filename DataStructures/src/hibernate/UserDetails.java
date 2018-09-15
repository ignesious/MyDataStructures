package hibernate;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GeneratorType;


@Entity (name="UserDetails")
@Table (name="User_Details")
public class UserDetails {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int userId;
private String userName;
@OneToOne
private Vehicle vehicle;

public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
//@Temporal (TemporalType.TIME)
//private Date joinedDate;
////@Embedded
////private Address address;
//@Lob
//private String description;
//@ElementCollection(fetch=FetchType)
//private Set<Address> listOfAddress= new HashSet<Address>();
//
//public Set<Address> getListOfAddress() {
//	return listOfAddress;
//}
//public void setListOfAddress(Set<Address> listOfAddress) {
//	this.listOfAddress = listOfAddress;
//}
//public Address getAddress() {
//	return address;
//}
//public void setAddress(Address address) {
//	this.address = address;
//}
/*public Date getJoinedDate() {
	return joinedDate;
}
public void setJoinedDate(Date joinedDate) {
	this.joinedDate = joinedDate;
}

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}*/
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}



}
