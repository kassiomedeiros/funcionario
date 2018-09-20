package br.com.funcionario.service;


import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.funcionario.model.Funciomario;
import br.com.funcionario.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	FuncionarioRepository repo;
	
	@Transactional
	public void save(Funciomario funcionario){
			this.repo.save(funcionario);
	}
	
	@Transactional(readOnly=true)
	public Iterable<Funciomario> list(){
		return this.repo.findAll();
	}
	
	@Transactional(readOnly=true)
	public  Optional <Funciomario> getById(long id){
		return this.repo.findById(id);
	}
	
	@Transactional
	public void delete(Funciomario funcionario){
		this.repo.delete(funcionario);
	}
}
