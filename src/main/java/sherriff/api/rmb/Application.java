package sherriff.api.rmb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Sherriff.Agboola on 12/12/19.
 */
@SpringBootApplication
@ComponentScan("sherriff.api.rmb.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
