package com.group.sunset.entity;

public class HippoResponse {

	String result;
	String reason;
	boolean role;
	boolean free;
	boolean disposable;
	String email;
	String domain;
	String user;
	String mailServerLocation;
	int duration;
        
        boolean warning;
        String  warning_description;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public boolean isRole() {
		return role;
	}
	public void setRole(boolean role) {
		this.role = role;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	public boolean isDisposable() {
		return disposable;
	}
	public void setDisposable(boolean disposable) {
		this.disposable = disposable;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getMailServerLocation() {
		return mailServerLocation;
	}
	public void setMailServerLocation(String mailServerLocation) {
		this.mailServerLocation = mailServerLocation;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

        public boolean isWarning() {
            return warning;
        }

        public void setWarning(boolean warning) {
            this.warning = warning;
        }

        public String getWarning_description() {
            return warning_description;
        }

        public void setWarning_description(String warning_description) {
            this.warning_description = warning_description;
        }
        
	@Override
	public String toString() {
		return "HippoResponse [result=" + result + ", reason=" + reason + ", role=" + role + ", free=" + free
				+ ", disposable=" + disposable + ", email=" + email + ", domain=" + domain + ", user=" + user
				+ ", mailServerLocation=" + mailServerLocation + ", duration=" + duration + "]";
	}
        
	
}
