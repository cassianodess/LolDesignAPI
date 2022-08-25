package cassianodess.github.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cassianodess.github.models.Code;
import cassianodess.github.services.CodeService;

@RestController
@CrossOrigin
@RequestMapping("/api/code")
public class CodeController {

	@Autowired
	private CodeService service;

	@GetMapping
	public ResponseEntity<Code> retriveTax(@RequestParam String origin, @RequestParam String destiny) {
		return ResponseEntity.ok(this.service.retrieveTax(origin, destiny));
	}

}
