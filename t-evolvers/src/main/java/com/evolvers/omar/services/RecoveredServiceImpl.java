package com.evolvers.omar.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolvers.omar.dao.IRecoveredDao;
import com.evolvers.omar.models.Recovered;

@Service
public class RecoveredServiceImpl implements RecoveredService{
	
	@Autowired
	private IRecoveredDao repository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Recovered> findAll() {
		// TODO Auto-generated method stub
		return (List<Recovered>) repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Recovered findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Recovered save(Recovered recovered) {
		// TODO Auto-generated method stub
		return repository.save(recovered);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	

}
