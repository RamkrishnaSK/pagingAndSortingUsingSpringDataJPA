package com.rsk.springdatajpa.pagingAndSortingUsingJPQL;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;

import com.rsk.springdatajpa.pagingAndSortingUsingJPQL.entities.Customer;
import com.rsk.springdatajpa.pagingAndSortingUsingJPQL.repos.CustomerRepository;

@SpringBootTest
class PagingAndSortingUsingJpqlApplicationTests {

	@Autowired
	private CustomerRepository repo;

	// page-size : 2
	@Test
	public void testPagingz() {
		Pageable pageable = PageRequest.of(0, 2, Direction.DESC, "name");
		List<Customer> l = repo.findAllCustomersPerPage(pageable);
		for (Customer cust : l) {
			System.out.println(cust.getId() + " = = = = " + cust.getName());
		}
	}

	// page-size : 5
	@Test
	public void testPagingzz() {
		Pageable pageable = PageRequest.of(1, 5, Direction.DESC, "name");
		List<Customer> l = repo.findAllCustomersPerPage(pageable); 
		for (Customer cust : l) {
			System.out.println(cust.getId() + " = = = = " + cust.getName()); 
		}
	}

}
