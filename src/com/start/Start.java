package com.start;

import java.sql.SQLException;

import com.controller.Controller;

public class Start {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Controller c = new Controller();
		c.insertOption();
		c.showOption();
	}

}
