package com.onpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onpe.model.Final;
import com.onpe.repository.IFinal;

@Service
public class FinalService implements IFinalServiceImp{
	@Autowired
	
	IFinal iFinal;
	@Override
	public Final getFinal() {
		return iFinal.getFinal();
	}
	
	

}
