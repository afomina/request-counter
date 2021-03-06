package andrianova.requestcounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Application start point
 */
@SpringBootApplication
@EnableWebMvc
@EnableJpaRepositories("andrianova.requestcounter.domain")
@EnableCaching
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

}
