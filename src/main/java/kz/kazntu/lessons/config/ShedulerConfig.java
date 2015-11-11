package kz.kazntu.lessons.config;

import kz.kazntu.lessons.beans.Sheduler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by daulet on 11/11/15.
 */
@Configuration
public class ShedulerConfig {
    @Bean(name = "sheduler")
    public Sheduler sheduler(){
        return new Sheduler() ;
    }
}
