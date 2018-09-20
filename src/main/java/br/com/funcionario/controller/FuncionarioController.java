package br.com.funcionario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.funcionario.model.Funciomario;
import br.com.funcionario.repository.FuncionarioRepository;
import br.com.funcionario.service.FuncionarioService;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	FuncionarioRepository er;
	
	@GetMapping()
	public ModelAndView listFuncionarios(){
		ModelAndView mv = new ModelAndView("listFuncionarios");
		Iterable <Funciomario> funcionarios = er.findAll();
		mv.addObject(funcionarios);
		return mv;
	}
		
	
}
