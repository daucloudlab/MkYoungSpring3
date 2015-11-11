package kz.kazntu.lessons.config;

import kz.kazntu.lessons.beans.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by daulet on 11/11/15.
 */
@Configuration
public class CustomerConfig {
    @Bean(name = "customer")
    public Customer customer(){
        return new Customer() ;
    }
}
