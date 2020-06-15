package com.sca.monitoramento_barragens.monitoramento_risco.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sca.monitoramento_barragens.model.TipoSensor;

/**
 * Valores máximo e mínimo de um determinado sensor.
 * @author arthur
 *
 */
@Entity
@Table(schema="sca_monitoramento_barragens")
public class RangeSensor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@ManyToOne
	@JoinColumn(name="id_envelope_operacional")
	private EnvelopeOperacional envelopeOperacional;
	
	@Enumerated(EnumType.STRING)
	private TipoSensor tipoSensor;
	
	@Column(name="valor_minimo")
	private Double valorMinimo;
	
	@Column(name="valor_maximo")
	private Double valorMaximo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public EnvelopeOperacional getEnvelopeOperacional() {
		return envelopeOperacional;
	}

	public void setEnvelopeOperacional(EnvelopeOperacional envelopeOperacional) {
		this.envelopeOperacional = envelopeOperacional;
	}

	public TipoSensor getTipoSensor() {
		return tipoSensor;
	}

	public void setTipoSensor(TipoSensor tipoSensor) {
		this.tipoSensor = tipoSensor;
	}

	public Double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(Double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public Double getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(Double valorMaximo) {
		this.valorMaximo = valorMaximo;
	}
	
	
	
	

}
