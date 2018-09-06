package hibernate;


import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity (name="UserDetails")
@Table (name="User_Details")
public class UserDetails {
@Id
private int userId;
private String userName;
@Temporal (TemporalType.TIME)
private Date joinedDate;
@Embedded
private Address address;
@Lob
private String description;


public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Date getJoinedDate() {
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
}
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
