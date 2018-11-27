package com.qa.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.qa.constants.PrizeConstants;
import com.qa.persistence.domain.Prize;
import com.qa.persistence.repository.PrizeRepository;

public class PrizeService implements IPrizeService {

	LetterChecker lt = new LetterChecker();
	Prize newPrize;

	@Autowired
	PrizeRepository repo;

	@Override
	public String createPrize(String accountNumber) {
		newPrize = new Prize(accountNumber, lt.checkLetter(accountNumber));
		repo.createPrize(newPrize);
		return PrizeConstants.CREATE_PRIZE;
	}

	@Override
	public String getPrize(String accountNumber) {
		return repo.getPrize(accountNumber);
	}

	public void setRepo(PrizeRepository repo) {
		this.repo = repo;
	}

}
