package chan.spring.coder.bootmsscbrewery.controller;

import chan.spring.coder.bootmsscbrewery.models.Customer;
import chan.spring.coder.bootmsscbrewery.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{custId}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("custId")UUID custId) {
        return new ResponseEntity<>(customerService.getCustomerById(custId), HttpStatus.OK);
    }
}
