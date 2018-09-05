package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UserDetailss {
@Id
private int userId;
private String userName;
private String phonenumber;
private int dapaChange;

public int getDapaChange() {
	return dapaChange;
}
public void setDapaChange(int dapaChange) {
	this.dapaChange = dapaChange;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
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
