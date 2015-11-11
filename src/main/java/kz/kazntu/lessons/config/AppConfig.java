package kz.kazntu.lessons.config;

import kz.kazntu.lessons.beans.App;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by daulet on 11/11/15.
 */
@Configuration
@Import({CustomerConfig.class, ShedulerConfig.class})
public class AppConfig {

}
