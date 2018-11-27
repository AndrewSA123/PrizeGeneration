package com.qa.persistence.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.qa.constants.PrizeConstants;
import com.qa.persistence.domain.Prize;

public class PrizeRepository implements IPrizeRepository {

	@Autowired
	private EntityManager em;

	@Override
	public String createPrize(Prize prize) {
		if (prize != null) {
			em.persist(prize);
			return PrizeConstants.CREATE_PRIZE;
		}
		return PrizeConstants.PRIZE_NOT_FOUND;
	}

	@Override
	public String getPrize(String accountNumber) {
		if(em.find(Prize.class, accountNumber) != null){
			return em.find(Prize.class, accountNumber).getPrize();
		}
		return PrizeConstants.PRIZE_NOT_FOUND;
	}

}
