package com.tributo.tributo;

import com.tributo.api.TributoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes={TributoApplication.class})
public class TributoApplicationTests {

	@Test
	public void contextLoads() {
	}

}

