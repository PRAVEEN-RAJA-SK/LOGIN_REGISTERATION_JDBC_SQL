package com.service;
import java.sql.SQLException;
import java.util.*;

import com.repository.Repository;
public class Login {
	Scanner sc = new Scanner(System.in);
     public void login() throws SQLException {
    	 System.out.println("USERNAME - ");
         String un = sc.next();
         
         System.out.println("PASSWORD - ");
         String up = sc.next();
         
         Repository rp = new Repository();
         
         String details[]=rp.getData(un, up);
         
         try {
			if(details[0].equals(un) && details[1].equals(up)) {
				 System.out.println("Login successful");
			 } 
		} catch (Exception e) {
			System.out.println("Invalid user");
		}  
     }
}
