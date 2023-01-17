package com.day22ExceptionCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Main addressBook=new Main();
	Scanner sc=new Scanner (System.in);
	String searchbyName;
	int option;
	 static Contacts contacts;
	 static ArrayList<Contacts> contact=new ArrayList();
	public void address() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first name");
	String fname=sc.next();
	System.out.println("enter midddle name");
	String mname=sc.next();
	System.out.println("enter last name");
	String lname=sc.next();
	System.out.println("enter city name");
	String city=sc.next();
	System.out.println("enter state name");
	String state=sc.next();
	System.out.println("enter zip name");
	String zip=sc.next(); 
	System.out.println("enter mobile number ");
	String mob_no=sc.next();
	System.out.println("enter mail id");
	String mail=sc.next();
	contacts=new Contacts(fname,mname,lname,city,state,zip,mob_no,mail);
	}
	 public void addcontacts() {
		 contact.add(contacts);
	 }
	 void edit() {
		 if(contact.get(0).getFname().equalsIgnoreCase(searchbyName)) {
			 System.out.println("enter contacts \n1.Firstname 2.Lastname"+" 3.city 4.state 5.zip 6.mobile number 7.mail");
			 int option=sc.nextInt();
			 switch(option) {
			 case 1:
				 System.out.println("enter first name");
				 contact.get(0).setFname(sc.next());
				 break;
			 case 2:
				 System.out.println("enter last name");
				 contact.get(0).setLname(sc.next());
				 break;
			 case 3:
				 System.out.println("enter city name");
				 contact.get(0).setCity(sc.next());
				 break;
			 case 4:
				 System.out.println("enter state name");
				 contact.get(0).setState(sc.next());
				 break;
			 case 5:
				 System.out.println("enter zip name");
				 contact.get(0).setZip(sc.next());
				 break;
			 case 6:
				 System.out.println("enter mobilenumber number");
				 contact.get(0).setMob_no(sc.next());
				 break;
			 case 7:
				 System.out.println("enter mail address");
				 contact.get(0).setMail(sc.next());
				 break;
				 default:
					 System.out.println("invalid contacts ");
			 }
		     }
		 else 
			 System.out.println("we cannot find contacts");
		     }
		 public void search() {
	         System.out.println("search(enter respective number)\n1.add contact 2.edit contact 3.print");
	         option=sc.nextInt();
	         switch(option) {
	         case 1:
	        	 addressBook.address();
	        	 addressBook.addcontacts();
	        	 addressBook.search();
	        	 break;
	         case 2:
	        	 System.out.println("enter name to edit");
	        	 searchbyName=sc.next();
	        	 addressBook.edit();
	        	 addressBook.search();
	        	 break;
	         case 3:
	        	 System.out.println(contact.get(0));
	        	 addressBook.search();
	        	 default:
	        		 System.out.println("invalid contacts");
	         }
		 }
			 
		 
		 
	 
	  public static void main(String[] args) {
		  System.out.println("welcome to address book program");
		  Main addressbook=new Main();
		  addressbook.address();
		  System.out.println(contacts);
		  addressbook.addcontacts();
		  System.out.println(contact.get(0));
		  addressBook.search();
		  }
          }

