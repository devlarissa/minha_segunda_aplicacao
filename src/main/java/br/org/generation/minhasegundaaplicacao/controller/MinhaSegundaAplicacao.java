package br.org.generation.minhasegundaaplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aplicacao2")
public class MinhaSegundaAplicacao {

	@GetMapping
	public String aplicacaoshow() {
		return "Minhas metas pra essa semana: <br/>1: Não surtar com o spring <br/> Melhorar o trabalho em equipe";
	}
}
