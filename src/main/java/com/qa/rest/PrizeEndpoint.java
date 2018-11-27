package com.qa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qa.constants.PrizeConstants;
import com.qa.service.IPrizeService;

@RequestMapping(path = PrizeConstants.BASE_ENDPOING)
public class PrizeEndpoint implements IPrizeEndpoint {

	@Autowired
	IPrizeService service;

	@Override
	@PostMapping(path = PrizeConstants.CREATE_ENDPOING)
	public String createPrize(@RequestBody String accountNumber) {
		return service.createPrize(accountNumber);
	}

	@Override
	@GetMapping(path = PrizeConstants.GET_ENDPOING)
	public String getPrize(@PathVariable("accountNumber") String accountNumber) {
		return service.getPrize(accountNumber);
	}

}
