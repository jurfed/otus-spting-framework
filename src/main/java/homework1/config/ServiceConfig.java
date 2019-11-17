package homework1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("homework1.service")
@EnableAspectJAutoProxy
public class ServiceConfig {



}
