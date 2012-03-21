package cantabille.config;

import com.mongodb.Mongo;
import groovy.transform.AutoClone;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * @author Keesun Baik
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppConfigTest {

	@Autowired Mongo mongo;
	@Autowired MongoTemplate mongoTemplate;
	@Autowired MongoDbFactory mongoDbFactory;

	@Test
	public void di(){
		assertThat(mongo, is(notNullValue()));
		assertThat(mongoTemplate, is(notNullValue()));
		assertThat(mongoDbFactory, is(notNullValue()));
	}

}
