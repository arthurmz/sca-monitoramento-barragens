package com.sca.monitoramento_barragens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.monitoramento_barragens.model.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long>{

}
