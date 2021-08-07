package com.evolvers.omar.services;

import java.util.List;

import com.evolvers.omar.models.Recovered;

public interface RecoveredService  {
	
	public List<Recovered> findAll();

	public Recovered findById(Long id);
	
	public Recovered save(Recovered recovered);
	
	public void delete(Long id);
}
