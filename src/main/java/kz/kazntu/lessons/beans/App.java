package kz.kazntu.lessons.beans;

import kz.kazntu.lessons.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by daulet on 11/11/15.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class) ;
        Customer customer = (Customer)context.getBean("customer") ;
        customer.printMsg("Hello 1");

        Sheduler sheduler = (Sheduler)context.getBean("sheduler") ;
        sheduler.printMsg("Hello 2");
    }
}
