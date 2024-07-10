package com.jack;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")

public class Controller {
    

	private final CustomerRepository customerRepository;

	 // constructor parameter into main:
	public Controller (CustomerRepository customerRepository) {
	        this.customerRepository = customerRepository;
	}
	
	@GetMapping
	public List<Customer> getCustomers() {

		 return customerRepository.findAll();
	}
	
	
	 static record NewCustomerRequest(
				String name,
				String email,
				Integer age
		) {

		}

	 @PostMapping
	 public void addCustomer(@RequestBody NewCustomerRequest request)  {
			Customer customer = new Customer();
			customer.setName(request.name());
			customer.setEmail(request.email());
			customer.setAge(request.age());
			customerRepository.save(customer);

		}
	 
	 @DeleteMapping("{customerId}")
	 public void deleteCustomer(@PathVariable("customerId") Integer id) {
		customerRepository.deleteById(id);

	}
	 
	 @PutMapping("{customerId}")
	 public void updateCustomer(@PathVariable("customerId") Integer id, @RequestBody NewCustomerRequest request) {
	     Customer customer = customerRepository.findById(id)
	             .orElseThrow();

	     // Update customer details
	     customer.setName(request.name());
	     customer.setEmail(request.email());
	     customer.setAge(request.age());

	     // Save the updated customer
	     customerRepository.save(customer);
	 }

	 
	
	@GetMapping("/greet")
	public GreetResponse greet() {
		GreetResponse response = new GreetResponse(
				"Hello",
				List.of("Java", "Golang", "Javascript"),
				new Person("Alex", 28, 30_000)
			); 
		return response;
		// instead of printing, we are now printing it using JSON objects.
		// greet (as seen below in GreetResponse) is the instance / key, and "Hello" is the value.
		// so this response object is returned which contains the key and values.
		// but for the last one, person is the key, and it's value pair is an OBJECT.
	}
	
	record Person (String name, int age, double savings) {
		
	}
	record GreetResponse(
			//GreetResponse now has a string, a list of strings, and a person
			String greet, //greet is the key, and "Hello" above is the value.
			List<String> favProgrammingLanguages,
			Person person
			) {}
	//records are classes that allow us to achieve immutability so we get
	// all arguments constructors equals hash code, all the fields
	// are finals, so we don't have to write code similar to this:
	//
	//class GreetResponse {
	//      private final String greet;
	//
	//    public String getGreet() {
	//       return greet;
	//     }
    // }
}
