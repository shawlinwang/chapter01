package com.didispace.Chapter1;

import com.didispace.Chapter1.domain.BlogProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class Chapter1ApplicationTests {

	@Autowired
	private BlogProperties blogProperties;
	@Test
	void contextLoads() {
		System.out.println(blogProperties.getName());
		System.out.println(blogProperties.getTitle());
		System.out.println(blogProperties.getBignumber());
	}

}
