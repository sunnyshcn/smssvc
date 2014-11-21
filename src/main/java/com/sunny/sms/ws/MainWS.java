package com.sunny.sms.ws;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunny.sms.service.SmsTest;

@RestController
@RequestMapping(value = "/rest")
public class MainWS {

	@Autowired
	private SmsTest smsTest;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, String> getDevice(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, String> result = new HashMap();
		result.put("time", smsTest.getDate());
		return result;

	}
}
