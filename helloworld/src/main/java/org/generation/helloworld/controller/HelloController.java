package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o spring que o codigo abaixa vai ser um controller
@RestController

// indica o endpoint da nossa classe controladora
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Salve Mundo";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "trabalho em equipe";
}
	@GetMapping("/bsm1")
	public String bsm1() {
		return "comunicação";
}}
	
