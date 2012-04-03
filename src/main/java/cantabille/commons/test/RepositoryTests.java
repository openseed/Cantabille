package cantabille.commons.test;

import cantabille.commons.util.ReflectionUtils;
import cantabille.config.AppConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.PostConstruct;

/**
 * @author Keesun Baik
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class RepositoryTests<R extends MongoRepository> {

	@Autowired ApplicationContext context;

	protected R repository;

	Class<R> repositoryClass;

	@PostConstruct
	public void init(){
		this.repositoryClass = ReflectionUtils.getGenericTypeParam(getClass(), 0);
		this.repository = context.getBean(repositoryClass);
	}

	@Before
	public void before(){
		repository.deleteAll();
	}

	@After
	public void after(){
		repository.deleteAll();
	}

}
