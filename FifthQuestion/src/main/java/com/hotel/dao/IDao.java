package com.hotel.dao;

import java.util.List;

import com.hotel.Guest;

public interface IDao {

	
		List<Guest> getAllGuest();
		Guest getGuestByName();

	

	

}
