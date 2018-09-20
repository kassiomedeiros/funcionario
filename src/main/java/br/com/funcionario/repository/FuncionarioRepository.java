package br.com.funcionario.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.funcionario.model.Funciomario;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funciomario, Long> {


}
