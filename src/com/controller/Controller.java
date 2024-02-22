package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.service.Login;
import com.service.Register;

public class Controller {
	
	  Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      public void insertOption() {
    	  sb.append("Enter your option \n");
    	  sb.append("1. Login \n");
    	  sb.append("2. Register \n");
    	  sb.append("3. Exit");
      }
      
      public void showOption() throws SQLException {
    	  System.out.println(sb);
    	  int op = sc.nextInt();
    	  performOption(op);
      }
      
      public void performOption(int op) throws SQLException {
    	  while(true) {
    		  switch(op) {
    		  case 1:
    			  Login lg = new Login();
    			  lg.login();
    			  break;
    			  
    		  case 2:
    			  Register rg = new Register();
    			  rg.Registeration();
    			  break;
    			  
    		  case 3:
    			  System.exit(0);
    			  break;
    			  
    		  default:
    			  System.out.println("Invalid Option...");
    			  break;
    		  }
    		  showOption();
    	  }
    	  
      }
      
      
}
