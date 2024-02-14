package deme.ahmadou.customerfrontthymeleaf.repositories;

import deme.ahmadou.customerfrontthymeleaf.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
