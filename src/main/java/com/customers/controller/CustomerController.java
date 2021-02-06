package com.customers.controller;

import com.customers.model.Customer;
import com.customers.repository.CustomerRepository;
import com.customers.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@GetMapping("/customers/{customer_id}")
	public ResponseEntity<Customer> getCustomersById(@PathVariable(value = "customer_id") Long customer_id)
			throws ResourceNotFoundException {
		Customer customer =
				customerRepository
				.findById(customer_id)
				.orElseThrow(() -> new ResourceNotFoundException("Customer not found on :: " + customer_id));
		return ResponseEntity.ok().body(customer);
	}

	@PostMapping("/customers")
	public Customer createCustomer(@Valid @RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

	@PutMapping("/customers/{customer_id}")
	public ResponseEntity<Customer> updateCustomer(
			@PathVariable(value = "customer_id") Long customer_id, @Valid @RequestBody Customer customerDetails)
					throws ResourceNotFoundException {

		Customer customer =
				customerRepository
				.findById(customer_id)
				.orElseThrow(() -> new ResourceNotFoundException("Customer not found on :: " + customer_id));
		customer.setName(customerDetails.getName());
		customer.setGender(customerDetails.getGender());
		customer.setEmail_address(customerDetails.getEmail_address());
		customer.setMobile_number(customerDetails.getMobile_number());
		customer.setAddress_line_1(customerDetails.getAddress_line_1());
		customer.setAddress_line_2(customerDetails.getAddress_line_2());
		customer.setState(customerDetails.getState());
		customer.setCity(customerDetails.getCity());
		customer.setZipcode(customerDetails.getZipcode());
		customer.setCountry(customerDetails.getCountry());
		final Customer updatedCustomer = customerRepository.save(customer);
		return ResponseEntity.ok(updatedCustomer);
	}

	@DeleteMapping("/customers/{customer_id}")
	public Map<String, Boolean> deleteCustomer(@PathVariable(value = "customer_id") Long customer_id) throws Exception {
		Customer customer =
				customerRepository
				.findById(customer_id)
				.orElseThrow(() -> new ResourceNotFoundException("Customer not found on :: " + customer_id));

		customerRepository.delete(customer);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
