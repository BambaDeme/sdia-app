package deme.ahmadou.customerfrontthymeleaf.web;

import deme.ahmadou.customerfrontthymeleaf.entities.Customer;
import deme.ahmadou.customerfrontthymeleaf.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerRepository customerRepository;

    @GetMapping("/customers")
    public String customers(Model model){

        List<Customer> customerList = this.customerRepository.findAll();

        model.addAttribute("customers", customerList);

        return "customers";
    }
}
