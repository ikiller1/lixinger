package com.example.demo.service;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class A_IndiceServiceTest {
	
	private static final Logger log = LoggerFactory.getLogger(A_IndiceServiceTest.class);

	@Autowired
	A_IndiceService service;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		assertNotEquals(null, service);
		log.debug(service.getToken());
		log.debug(service.getUrl());
		service.getDefaultData();
	}

}
