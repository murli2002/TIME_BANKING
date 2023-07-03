package net.javaguides.tb.service;

import org.springframework.stereotype.Service;

import net.javaguides.tb.domain.Customer;
import net.javaguides.tb.repository.CustomerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.*;

@Service 
public class CustomerService {
	
	@Autowired 
	
	private CustomerRepository repo;
	public List<Customer> listAll() {
		return repo.findAll();
		
	}
	public void save(Customer std) {
		repo.save(std);
		
	}
	public Customer get(long id) {
		return repo.findById(id).get();
		
	}
	
	public void delete (long id) {
		repo.deleteById(id);
	}

}
