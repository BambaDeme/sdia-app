package deme.ahmadou.customerfrontthymeleaf;

import deme.ahmadou.customerfrontthymeleaf.entities.Customer;
import deme.ahmadou.customerfrontthymeleaf.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerFrontThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            List<Customer> customerList = List.of(
                    Customer.builder()
                            .name("Bamba")
                            .email("bamba@mail.com")
                            .build(),
                    Customer.builder()
                            .name("Khadim")
                            .email("khadim@mail.com")
                            .build(),
                    Customer.builder()
                            .name("Cheikh Ahmadou")
                            .email("cheikh-ahmadou@mail.com")
                            .build()
            );

            customerRepository.saveAll(customerList);
        };
    }

}
