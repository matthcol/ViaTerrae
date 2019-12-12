package com.formation.services;

import com.formation.dto.basketType.toSave.BasketTypeToSave;
import com.formation.persistence.entities.BasketType;

public interface IVerificationService {

	public boolean isBasketSaveable(BasketTypeToSave b);
	public boolean isBasketDeletable(BasketType b);
	
}