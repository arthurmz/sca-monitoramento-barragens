package com.sca.monitoramento_barragens.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sca.monitoramento_barragens.model.Sensor;
import com.sca.monitoramento_barragens.repository.SensorRepository;
import com.sca.monitoramento_barragens.service.SensorService;

@RestController
@RequestMapping("/sensores")
public class SensorController {
	
	@Autowired
	private SensorService sensorService;
	
	@Autowired
	private SensorRepository sensorRepository;
	
	@GetMapping
	public List<Sensor> getAllSensors(){
		return sensorService.findAll();
	}
	
	@GetMapping("{id}")
	public Sensor getSensor(@PathVariable Long id) {
		return sensorRepository.getOne(id);
	}
	
	@PostMapping()
	public Sensor saveSensor(@RequestBody Sensor Sensor) throws Exception {
		return sensorService.saveSensor(Sensor);
	}

}
