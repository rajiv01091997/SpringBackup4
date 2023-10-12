package com.globallogic.Application;
import java.util.*;

import com.globallogic.Model.Token;
import com.globallogic.Model.Vehicle;
public class Main {
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//	Vehicle vehicle1=new Vehicle(1,"car","rajiv");
//	Vehicle vehicle2=new Vehicle(2,"truck","niraj");
//	Vehicle vehicle3=new Vehicle(3,"superbike","shubham");
//	Vehicle vehicle4=new Vehicle(4,"bike","vishal");
//	Vehicle vehicle5=new Vehicle(5,"jeep","ankit");
	
	List<Token> list=new ArrayList<>();
	
	
	
	int avlSlots=2;
	boolean flag=true;
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
		System.out.println("Enter vehicle details you want to park: vehivleId,vehicleName,ownerName");
		Vehicle vehicle=new Vehicle(sc.nextInt(),sc.next(),sc.next());
		System.out.println("Enter TokenId,checkInTime,CheckOutTime ");
		Token token=new Token(sc.nextInt(),sc.nextInt(),sc.nextInt(),vehicle.getVehicleId());
		list.add(token);
		avlSlots--;
		System.out.println("vehicle parked");
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
					" CheckOutTime= "+to.getCheckOutTime()+" VehicleId= "+to.getVehicleId());
		}
		break;
	case 4:
		flag=false;
		break;
	}
	}

	}

}
