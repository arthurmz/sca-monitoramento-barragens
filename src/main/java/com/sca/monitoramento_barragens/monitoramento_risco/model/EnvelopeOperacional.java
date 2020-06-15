package com.sca.monitoramento_barragens.monitoramento_risco.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Um "envelope operacional" descreve um conjunto de condições que devem ser todas atendidas 
 * ao mesmo tempo para se considerar que a barragem monitorada está dentro da margem de segurança.
 * 
 * É possível assim, construir diversos conjuntos de leituras de sensores diferentes. Cada um com um range
 * específico, onde um profissional capacitado é capaz de formular as interações entre os sensores.
 * 
 * Por exemplo: 
 * É possível ter um sensor de vento com um range de 10m/s a 30m/s considerado seguro.
 * Mas, se a pressão da água estiver acima de 10000N/m², a velocidade do vento acima de 20m/s deve ser considerado inseguro.
 * @author arthur
 *
 */
@Entity
@Table(schema="sca_monitoramento_barragens")
public class EnvelopeOperacional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@OneToMany(mappedBy="envelopeOperacional")
	private List<RangeSensor> rangeSensores;

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

	public List<RangeSensor> getRangeSensores() {
		return rangeSensores;
	}

	public void setRangeSensores(List<RangeSensor> rangeSensores) {
		this.rangeSensores = rangeSensores;
	}

}
