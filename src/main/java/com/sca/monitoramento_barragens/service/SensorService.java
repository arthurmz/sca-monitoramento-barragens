package com.sca.monitoramento_barragens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.monitoramento_barragens.model.Sensor;
import com.sca.monitoramento_barragens.repository.SensorRepository;

@Service
public class SensorService {
	
	@Autowired
	private SensorRepository SensorRepository;
	
	@Transactional
	public Sensor saveSensor(Sensor Sensor) throws Exception {
		 Sensor b = SensorRepository.save(Sensor);
		 return b;
	}
	
	public List<Sensor> findAll() {
		return SensorRepository.findAll();
	}

}
