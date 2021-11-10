package ma.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ma.training.service.TodoService;
import ma.training.service.TodoServiceImpl;

@Configuration
@Import(JdbcConfig.class)
@ComponentScan(basePackages = "ma.training")
public class AppConfig {

    @Bean(name="demoService")
    public TodoService doItNow()
    {
        return new TodoServiceImpl();
    }

}
