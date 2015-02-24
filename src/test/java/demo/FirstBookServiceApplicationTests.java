package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.abhub.springexchange2014.FirstBookServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FirstBookServiceApplication.class)
@WebAppConfiguration
public class FirstBookServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
