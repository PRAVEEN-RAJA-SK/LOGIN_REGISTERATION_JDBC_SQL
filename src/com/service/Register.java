package com.service;
import java.sql.SQLException;
import java.util.Scanner;

import com.repository.Repository;
public class Register {
	    Scanner sc = new Scanner (System.in);
        public void Registeration() throws SQLException {
        	System.out.println("Enter your name -");
        	String un=sc.next();
        	System.out.println("Enter your password -");
        	String up=sc.next();
        	Repository rp = new Repository();
        	if(rp.insert(un, up)) {
        		System.out.println("Registeration successful.");
        	}else {
        		System.out.println("Registration failed.");
        	}
        }
}
