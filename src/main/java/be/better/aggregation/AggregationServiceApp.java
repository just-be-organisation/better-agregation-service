package be.better.aggregation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "be.better.aggregation.service")
@EnableTransactionManagement(proxyTargetClass = true)
@EnableScheduling
@EnableJpaRepositories
public class AggregationServiceApp {
}
