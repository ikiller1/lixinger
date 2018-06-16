/**
 * 
 */
package com.example.demo.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.example.demo.bean.Metrics;
import com.example.demo.bean.RequestParam;
import com.example.demo.util.HttpHelper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author chenfeixu
 *
 */
public class A_IndiceService {

	private static final Logger log = LoggerFactory.getLogger(A_IndiceService.class);
	@Autowired
	ObjectMapper mapper;
	@Value("${lixinger.url.aindice}")
	private String url;
	@Value("${lixinger.token}")
	private String token;

	public String getUrl() {
		return url;
	}

	public String getToken() {
		return token;
	}

	public String getDefaultData() throws Exception {
		log.debug("getDefaultData()");
		RequestParam param = new RequestParam();
		param.setToken(token);
		List<String> metrics = new ArrayList<>();
		metrics.add(Metrics.PE_TTM);
		param.setMetrics(metrics);

		String map = mapper.writeValueAsString(param);
		log.debug(map);
		Map<String, Object> paramMap = mapper.readValue(map, new TypeReference<Map<String, Object>>() {
		});
		log.debug(paramMap.toString());
		String result = HttpHelper.doPost(url, paramMap);
		log.debug("result:" + result);
		return result;

	}
}
