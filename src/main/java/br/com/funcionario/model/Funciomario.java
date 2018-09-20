package br.com.funcionario.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of= {"id"})
@Entity
@Table(name="funcionario_tb")
public class Funciomario implements Serializable {
	
	private static final long serialVersionUID = 1;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column
	private String nome;
	
	@Column
	private String email;
	
	@Column
	private String matricula;
	


	
	
}
