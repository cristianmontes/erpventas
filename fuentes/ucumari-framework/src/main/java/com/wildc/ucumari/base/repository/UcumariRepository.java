package com.wildc.ucumari.base.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UcumariRepository <T, ID extends Serializable>
extends JpaRepository<T, ID> {
	
	public List<T> ejecutarHQL(String hql, List<Object> params);

}
