package cassianodess.github.controllers;

import java.util.List;

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
@RequestMapping("/api/codes")
public class CodeController {

	@Autowired
	private CodeService service;
	
	@GetMapping()
	public ResponseEntity<List<String>> findAllCodes() {
		return ResponseEntity.ok(this.service.findAllCodes());
	}

	@GetMapping("/retrieve")
	public ResponseEntity<Code> retriveTax(
			@RequestParam(required = true) String origin,
			@RequestParam(required = true) String destiny) {
		return ResponseEntity.ok(this.service.retrieveTax(origin, destiny));
	}

}
