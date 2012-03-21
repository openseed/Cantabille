package cantabille.config;

import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Controller;

/**
 * @author Keesun Baik
 */
@Configuration
@ComponentScan(
		basePackages = "cantabille",
		excludeFilters = {@ComponentScan.Filter(Configuration.class), @ComponentScan.Filter(Controller.class)})
@ImportResource("/context.xml")
@PropertySource("/env.properties")
public class AppConfig {

	@Autowired Environment env;

	@Bean
	public MongoFactoryBean mongo(){
		MongoFactoryBean mongoFactoryBean = new MongoFactoryBean();
		mongoFactoryBean.setHost("localhost");
		return mongoFactoryBean;
	}

	@Bean
	public MongoDbFactory mongoDbFactory(Mongo mongo){
		return new SimpleMongoDbFactory(mongo, env.getProperty("db.name"));
	}

	@Bean
	public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory){
		return new MongoTemplate(mongoDbFactory);
	}

}