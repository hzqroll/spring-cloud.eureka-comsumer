package com.roll.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by haozq
 * Date: 2018/5/21 上午9:58
 */
@RestController
public class ConsumerController {


	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "get-say", method = RequestMethod.GET)
	public String get() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		Test test = new Test();
		test.setType("get");
		test.setValue("value");
		return objectMapper.writeValueAsString(test);
		//return restTemplate.getForEntity("http://eureka-producer/hello/", String.class).getBody();

	}
}
