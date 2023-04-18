package com.onpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onpe.model.Final;

@Repository
public interface IFinal extends JpaRepository<Final, Integer>{
	@Query(value="(call sp_getResumen_BautistaGarcia)", nativeQuery = true )
	Final getFinal();

}
