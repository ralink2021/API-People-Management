package com.digitalone.pessoasapi.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	
	private Long id;
	
	private String nome;
	
	private String sobrenome;
	
	private String cpf;
	
	private LocalDate dataNascimento;
	
	private List<Phone> telefone = new ArrayList<>();

}
