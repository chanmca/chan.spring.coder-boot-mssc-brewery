package chan.spring.coder.bootmsscbrewery.services;

import chan.spring.coder.bootmsscbrewery.models.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID custId);
}
