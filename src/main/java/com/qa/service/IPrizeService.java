package com.qa.service;

import org.springframework.stereotype.Service;

@Service
public interface IPrizeService {

	public String createPrize(String accountNumber);

	public String getPrize(String accountNumber);

}
