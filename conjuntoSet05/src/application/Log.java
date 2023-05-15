package application;

import java.util.Date;
import java.util.Objects;

public class Log {
	
	private String userName;
	private Date moment;
	
	public Log() {
		
	}

	public Log(String userName, Date moment) {
		this.userName = userName;
		this.moment = moment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Log other = (Log) obj;
		return Objects.equals(userName, other.userName);
	}

	@Override
	public String toString() {
		return "Log [userName=" + userName + ", moment=" + moment + "]";
	}
	
	
	
	

	
}
