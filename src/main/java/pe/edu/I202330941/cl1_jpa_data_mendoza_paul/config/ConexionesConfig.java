package pe.edu.I202330941.cl1_jpa_data_mendoza_paul.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConexionesConfig {

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(System.getenv("DB_WORLD_URL"));
        config.setUsername(System.getenv("DB_WORLD_USER"));
        config.setPassword(System.getenv("DB_WORLD_PASS"));
        config.setDriverClassName(System.getenv("DB_WORLD_DRIVER"));
        config.setMaximumPoolSize(30);
        config.setMinimumIdle(4);
        config.setIdleTimeout(4 * 60 * 1000);
        config.setConnectionTimeout(45 * 1000);
        return new HikariDataSource(config);
    }
}