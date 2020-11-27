package conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import oracle.jdbc.pool.OracleDataSource;
import javax.sql.DataSource;
import java.sql.SQLException;
@Configuration
@ConfigurationProperties("oracle")
public class OracleConfiguration {
    private  String username;
    private String password;
    private String url;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource)
    {
        return new JdbcTemplate(dataSource);
    }
    @Bean
    DataSource dataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser("cGarg");
        dataSource.setPassword("Uhg34$jgk_uk");
        dataSource.setURL("jdbc:oracle:thin:@ptvdb1_tp");
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        return dataSource;
    }

}
