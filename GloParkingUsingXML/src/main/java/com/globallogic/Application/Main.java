package com.globallogic.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globallogic.Model.Token;
import com.globallogic.Model.Vehicle;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Token> list=new ArrayList<Token>();
		
		int avlSlots=2;
		boolean flag=true;
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("objects.xml");
		
		while(flag==true)
		{
			System.out.println("============================================================");
			System.out.println("Enter 1 for parking");
			System.out.println("Enter 2 for total available slots");
			System.out.println("Enter 3 for getting list of tokens alloted");
			System.out.println("Enter 4 for exit");
			System.out.println("============================================================");
			int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			if(avlSlots>0)
			{
			ApplicationContext context=new ClassPathXmlApplicationContext("objects.xml");
			
			Vehicle vehicle=(Vehicle) context.getBean("vehicle");
			System.out.println("Enter vehicleId,vehicleName,ownerName");
			vehicle.setVehicleId(sc.nextInt());
			vehicle.setVehicleName(sc.next());
			vehicle.setOwnerName(sc.next());
			
			
			Token tok=(Token) context.getBean("token");
			System.out.println("enter checkInTime,checkOutTime and tokenId");
			tok.setCheckInTime(sc.nextInt());
			tok.setCheckOutTime(sc.nextInt());
			tok.setTokenId(sc.nextInt());
			
			
			System.out.println("Vehicle inserted successfully");
			avlSlots--;
			list.add(tok);
			}
			else
				System.out.println("slots not available");
			
			break;
		case 2:
			System.out.println("Total available slots: "+avlSlots);
			break;
		case 3:
			for(Token to:list)
			{
				System.out.println("TokenId= "+to.getTokenId()+" CheckInTime= "+to.getCheckInTime()+
						" CheckOutTime= "+to.getCheckOutTime()+" VehicleId= "+to.getVehicle());
			}
			break;
		case 4:
			flag=false;
			break;
		}
		}


	}

}
