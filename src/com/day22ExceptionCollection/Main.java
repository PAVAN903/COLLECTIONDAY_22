package com.day22ExceptionCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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
	  public static void main(String[] args) {
		  System.out.println("welcome to address book program");
		  Main addressbook=new Main();
		  addressbook.address();
		  System.out.println(contacts);
		  addressbook.addcontacts();
		  System.out.println(contact.get(0));
		  }
          }

