package com.niit.collaborationbackend.DAOImpl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collaborationbackend.DAO.ICustomerDAO;
import com.niit.collaborationbackend.Modal.Customer;


@Repository("customerdao")
@Transactional
public class CustomerDAOImpl implements ICustomerDAO {
	
	@Autowired
	SessionFactory sessionfactory;

	@Override
	public boolean addCustomer(Customer customer) {
		try {
			sessionfactory.getCurrentSession().save(customer);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteCustomer(Customer customer) {
		try {
			sessionfactory.getCurrentSession().delete(customer);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		try {
			sessionfactory.getCurrentSession().update(customer);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public ArrayList<Customer> selectAllCustomer() {
		try {
			return (ArrayList<Customer>) sessionfactory.getCurrentSession().createCriteria(Customer.class).
					add(Restrictions.eq("status", true)).list();
		}
		catch (Exception e)
		{
			return null;
		}
	}

	@Override
	public Customer selectOneCustomer(String cus_Email) {
		try {
			return (Customer) sessionfactory.getCurrentSession().createCriteria(Customer.class).
			add(Restrictions.eq("cust_email", cus_Email)).list();
		}
		catch (Exception e)
		{
			return null;
		}
	}

}
