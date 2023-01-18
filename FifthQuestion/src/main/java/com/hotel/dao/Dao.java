package com.hotel.dao;

import java.util.List;

import com.hotel.Guest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.hotel.Guest;
import com.hotel.connection.DbConnection;

public class Dao implements IDao {
	private Connection con;
	private Statement stmt;

	public List<Guest> getAllGuest() {
		String sqlQuery = "SELECT * FROM GUEST";
		List<Guest> guests = new ArrayList<>();
		Guest guest = null;
		ResultSet rs = null;

		try {
			con = new DbConnection().getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlQuery);
			while(rs.next()) {
				guest = new Guest(rs.getInt("guest_id"), rs.getString("name"), rs.getString("city"));
				guests.add(guest);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return guests;
	}

	@Override
	public Guest getGuestByName() {
		 getAllGuest().stream().map(guest -> guest.getName()).forEach(System.out::print);
		 //todo
		 return null;
	}

}
