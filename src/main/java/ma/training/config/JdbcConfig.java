package ma.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "ma.training")
public class JdbcConfig {
    private DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:jdbc/schema.sql").addScript("classpath:jdbc/data.sql").build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate template=new JdbcTemplate();
        template.setDataSource(dataSource());
        return template;
    }
    }

