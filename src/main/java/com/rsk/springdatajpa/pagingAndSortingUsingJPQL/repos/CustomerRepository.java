package com.rsk.springdatajpa.pagingAndSortingUsingJPQL.repos;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rsk.springdatajpa.pagingAndSortingUsingJPQL.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query("from Customer") 
	public List<Customer> findAllCustomersPerPage(Pageable pageable);
	 
}
 