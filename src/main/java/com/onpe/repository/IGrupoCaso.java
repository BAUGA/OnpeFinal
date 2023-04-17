package com.onpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onpe.Model.GrupoCaso;

@Repository
public interface IGrupoCaso extends JpaRepository <GrupoCaso,String> {
	@Query (value= "{call usp_getGrupoVotacion(:id)}",nativeQuery=true)
	GrupoCaso getGrupoVotacion(String id);
	

}
