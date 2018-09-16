package hibernate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity

public class TwoWheeler extends Vehicle {

	private String steeringHandle;
	
//	@ManyToOne
//	private UserDetails userdetails;
//	
//	public UserDetails getUserdetails() {
//		return userdetails;
//	}
//
//	public void setUserdetails(UserDetails userdetails) {
//		this.userdetails = userdetails;
//	}

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
	
}
