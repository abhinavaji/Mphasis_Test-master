package com.banking.repository;

import java.util.ArrayList;
import java.util.List;

import com.banking.BO.CreditExposureBO;
import com.banking.BO.CustomerBO;
import com.banking.BO.FacilityBO;
import com.banking.BO.SectorBO;

public class MockDataClass {

	public static CreditExposureBO getAllCreditExposure() {
		CreditExposureBO allExposureBO = new CreditExposureBO();
		List<SectorBO> sectors = new ArrayList<>();
		SectorBO sector1 = getSector(1, 2345678);
		sectors.add(sector1);

		SectorBO sector2 = getSector(2, 133578);
		sectors.add(sector2);

		SectorBO sector3 = getSector(3, 1278);
		sectors.add(sector3);

		SectorBO sector4 = getSector(4, 24578);
		sectors.add(sector4);

		SectorBO sector5 = getSector(5, 544578);
		sectors.add(sector5);

		SectorBO sector6 = getSector(6, 12378);
		sectors.add(sector6);

		SectorBO sector7 = getSector(7, 12378);
		sectors.add(sector7);

		SectorBO sector8 = getSector(8, 8378);
		sectors.add(sector8);

		SectorBO sector9 = getSector(9, 8762378);
		sectors.add(sector9);

		SectorBO sector10 = getSector(10, 102378);
		sectors.add(sector10);

		allExposureBO.setSectors(sectors);
		return allExposureBO;
	}

	private static SectorBO getSector(int id, int exposure) {
		SectorBO sector = new SectorBO();
		sector.setId(id);
		sector.setName("Sector-" + id);
		sector.setType("Credit");
		sector.setExposure(exposure);
		sector.setFacilities(getFacilities());
		sector.setCustomers(getCustomerList());
		return sector;
	}

	private static List<CustomerBO> getCustomerList() {
		List<CustomerBO> customers = new ArrayList<>();
		CustomerBO customer1 = new CustomerBO(101, "Ram", "Prakash", "Yadav", 32, "Noida");
		customers.add(customer1);
		CustomerBO customer2 = new CustomerBO(102, "Mohan", null, "Yadav", 33, "Noida");
		customers.add(customer2);
		CustomerBO customer3 = new CustomerBO(103, "Shayam", "Kumar", "Singh", 43, "Noida");
		customers.add(customer3);
		CustomerBO customer4 = new CustomerBO(104, "Anil", null, "Shukla", 53, "Noida");
		customers.add(customer4);
		CustomerBO customer5 = new CustomerBO(105, "Sanjay", null, "Sharma", 23, "Noida");
		customers.add(customer5);
		CustomerBO customer6 = new CustomerBO(106, "Ajay", null, "Kumar", 31, "Noida");
		customers.add(customer6);
		CustomerBO customer7 = new CustomerBO(107, "Kamal", "Kishore", "Pant", 45, "Noida");
		customers.add(customer7);
		return customers;
	}

	private static List<FacilityBO> getFacilities() {
		List<FacilityBO> facilities = new ArrayList<>();
		FacilityBO facility1 = new FacilityBO(11, "facility1", "credit");
		facilities.add(facility1);
		FacilityBO facility2 = new FacilityBO(22, "facility2", "credit");
		facilities.add(facility2);
		FacilityBO facility3 = new FacilityBO(33, "facility3", "credit");
		facilities.add(facility3);
		return facilities;
	}

}
