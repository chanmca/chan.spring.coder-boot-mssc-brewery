package chan.spring.coder.bootmsscbrewery.services;

import chan.spring.coder.bootmsscbrewery.models.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(UUID custId) {
        return new Customer().builder().id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }
}
