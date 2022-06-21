package mx.com.segurossura.testdatabasedual.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"mx.com.segurossura.testdatabasedual.repositories.repository1"}, mongoTemplateRef = NewDb1Config.MONGO_TEMPLATE)
public class NewDb1Config {
    protected static final String MONGO_TEMPLATE = "newdb1MongoTemplate";
}
