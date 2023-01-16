package com.day22ExceptionCollection;

public class Contacts {
	

			private String fname;
			private String mname;
			private String lname;
			private String city;
			private String state;
			private String zip;
			private String mob_no;
			private String mail;
			 
			public Contacts() {
			}

			public String getFname() {
				return fname;
			}

			public void setFname(String fname) {
				this.fname = fname;
			}

			public String getMname() {
				return mname;
			}

			public void setMname(String mname) {
				this.mname = mname;
			}

			public String getLname() {
				return lname;
			}

			public void setLname(String lname) {
				this.lname = lname;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getState() {
				return state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getZip() {
				return zip;
			}

			public void setZip(String zip) {
				this.zip = zip;
			}

			public String getMob_no() {
				return mob_no;
			}

			public void setMob_no(String mob_no) {
				this.mob_no = mob_no;
			}

			public String getMail() {
				return mail;
			}

			public void setMail(String mail) {
				this.mail = mail;
			}

			
			public Contacts(String fname, String mname, String lname, String city, String state, String zip, String mob_no,
					String mail) {
				super();
				this.fname = fname;
				this.mname = mname;
				this.lname = lname;
				this.city = city;
				this.state = state;
				this.zip = zip;
				this.mob_no = mob_no;
				this.mail = mail;
			}
			public String toString() {
				return "\nfirstname:"+fname+"\nmiddlename:"+mname+"\nlastname:"+lname+"\ncity:"+city+"\nstate:"+state+"\nzip:"+zip+"\nmoobil,mail";
				}

			
			    }







