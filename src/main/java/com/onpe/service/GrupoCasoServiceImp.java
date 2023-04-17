package com.onpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onpe.model.GrupoCaso;
import com.onpe.repository.IGrupoCaso;

@Service
public class GrupoCasoServiceImp implements IGrupoCasoService {
@Autowired
IGrupoCaso iGrupoCaso;
@Override
public GrupoCaso getGrupoVotacion(String id) {
	return iGrupoCaso.getGrupoVotacion(id);
}
}
