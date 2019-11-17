package homework1.config;

import homework1.dao.Logger2;
import homework1.dao.SimpleTest;
import homework1.dao.TestDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.io.FileNotFoundException;
import java.util.Locale;

@EnableAspectJAutoProxy
@Configuration
@PropertySource("classpath:homework1/app.properties")
public class DaoConfig {

    @Value("${csv.pathEn}")
    private String questionFileEn;

    @Value("${csv.pathRu}")
    private String questionFileRu;

    @Bean(name = "simpleDao")
    public TestDao getTestDao() throws FileNotFoundException {
        String questionsPath;
        String locale = Locale.getDefault().getLanguage();
        if (locale.equals("aspect")) {
            return new SimpleTest(questionFileRu);
        } else {
            return new SimpleTest(questionFileEn);

        }
    }

    @Bean
    public Logger2 getlogger2() {
        return new Logger2();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
