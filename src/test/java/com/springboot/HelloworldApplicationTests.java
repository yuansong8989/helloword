package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldApplicationTests {

		@Test
		public String contextLoads() {
			return "欢迎你的登陆";
		}
	public static  void main(String args[]){
		SpringApplication.run(HelloworldApplication.class,args);
	}
}

