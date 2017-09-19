package org.am.jparepos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;

import java.io.IOException;

/**
 * The Application class.
 *
 * @author Alexander Maximenya
 * @version 2017-09-19
 */
@SpringBootApplication(exclude = RepositoryRestMvcAutoConfiguration.class) //Disables default rest mappings
public class Application {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
    }
}
