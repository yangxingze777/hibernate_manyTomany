package com.yxz.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name {
	
		@Column(name="firstname")
		private String firstName;
		
		@Column(name="lastname")
		private String lastName;
		
		public String getFirstName(String firstname) {
			return firstName;
		}
		
		public void setFirstName(String firstname) {
			this.firstName = firstname;
		}
		
		public String getLastName(String lastname) {
			return lastName;
		}
		public void setLastName(String lastname) {
			this.lastName = lastname;
		}
}
