package com.hotel.service;

import com.hotel.dao.Dao;
import com.hotel.dao.IDao;

class HotelService{
	public static void main(String[] args) {
		IDao dao = new Dao();
		System.out.println(dao.getAllGuest());
		dao.getGuestByName();
	}
}
