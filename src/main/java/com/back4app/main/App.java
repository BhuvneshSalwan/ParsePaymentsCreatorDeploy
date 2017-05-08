package com.back4app.main;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import com.back4app.mongo.MongoDAO;

public class App{

	public static void main(String arg[]){

		Common common = new Common();
		
		common.createPayments();
		
		MongoDAO.database = null;
		MongoDAO.collection = null;
		MongoDAO.client.close();

	}
}
