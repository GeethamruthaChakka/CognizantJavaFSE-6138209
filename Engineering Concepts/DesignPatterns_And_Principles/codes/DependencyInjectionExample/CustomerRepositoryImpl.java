package DependencyInjectionExample;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerData = new HashMap<>();

    public CustomerRepositoryImpl() {
        customerData.put("101", new Customer("101", "Alice"));
        customerData.put("102", new Customer("102", "Bob"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerData.get(id);
    }
}

