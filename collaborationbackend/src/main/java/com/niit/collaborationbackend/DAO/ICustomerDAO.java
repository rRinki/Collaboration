package com.niit.collaborationbackend.DAO;

import java.util.ArrayList;

import com.niit.collaborationbackend.Modal.Customer;

public interface ICustomerDAO {
	
	boolean addCustomer(Customer customer);
	boolean deleteCustomer(Customer customer);
	boolean updateCustomer(Customer customer);
	ArrayList<Customer> selectAllCustomer();
	Customer selectOneCustomer(String cus_Email);
	
}
