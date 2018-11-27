package com.qa.rest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public interface IPrizeEndpoint {

	public String createPrize(String accountNumber);

	public String getPrize(String accountNumber);

}
