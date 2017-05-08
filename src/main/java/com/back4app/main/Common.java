package com.back4app.main;

import java.util.ArrayList;

import org.bson.Document;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.back4app.entities.Transactions;
import com.back4app.mongo.MongoDAO;
import com.back4app.mongoOperation.MongoOp;
import com.hibernate.factory.BuildFactory;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class Common {

	public void createPayments(){
		
		ArrayList<Document> getPayments = MongoOp.getPaymentsData(1);
		
		System.out.println(getPayments.size());
		
		if(getPayments.size() > 0){
			
			SessionFactory factory = BuildFactory.getFactory();	
			
			System.out.println(factory);
			
			for(Document payments : getPayments){
				
				Transactions sqlTransactions = new Transactions();
				
				System.out.println("The Payment object id outside is : "+payments.getString("_id"));
				
				if(payments.containsKey("amount")){
					
					sqlTransactions.setAmount(payments.getInteger("amount").doubleValue());
					
				}else{
					sqlTransactions.setAmount(null);
				}
				
				if(payments.containsKey("_created_at")){
					
					sqlTransactions.setInsert_time(payments.getDate("_created_at"));
					
				}else{
					sqlTransactions.setInsert_time(null);
				}
				
				if(payments.containsKey("referrer")){
					
					sqlTransactions.setSource(payments.getString("referrer"));
					
				}else{
					sqlTransactions.setSource(null);
				}
				
				sqlTransactions.setStatus(1);
				
				if(payments.containsKey("_updated_at")){
					
					sqlTransactions.setUpdate_time(payments.getDate("_updated_at"));
					
				}else{
					sqlTransactions.setUpdate_time(null);
				}
				
				if(payments.containsKey("_id")){
					
					sqlTransactions.setObject_id(payments.getString("_id"));
					
				}else{
					sqlTransactions.setObject_id(null);
				}
				
				sqlTransactions.setPlan_id("1");
				
				sqlTransactions.setPlan_duration("1");
				
				sqlTransactions.setIs_updated(1);
				
				sqlTransactions.setParse_client_id(payments.getString("client_id"));
				
				Session session = BuildFactory.getFactory().openSession();
				session.beginTransaction();
		
				System.out.println("Session Value is : " + session);
				
				System.out.println(sqlTransactions);
				
				int transactions_id = (Integer) session.save(sqlTransactions);
				
				System.out.println("Transaction ID created is : "+transactions_id);
				
				if(transactions_id == 0){
					session.getTransaction().rollback();
					session.close();
					continue;
				}
				
				session.getTransaction().commit();
				session.close();
				
				MongoDAO.collection.updateOne(Filters.eq("_id", payments.getString("_id")), Updates.set("is_updated", 0));
			
				System.out.println("The Payments with object ID : "+payments.getString("_id")+" is successfully created.");
			
			}
			
		}else{
			System.out.println("No Creation is requested in Payments in Parse.");
		}
			
	}
	
}