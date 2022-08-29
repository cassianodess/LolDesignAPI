package cassianodess.github.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cassianodess.github.services.PlanService;

@CrossOrigin
@RestController
@RequestMapping("/api/plans")
public class PlanController {

	@Autowired
	private PlanService service;

	@GetMapping
	public ResponseEntity<List<Integer>> findAllPlans() {
		return ResponseEntity.ok(this.service.findAllPlans());
	}

	@GetMapping("/destinies")
	public ResponseEntity<List<String>> findAllDestinies(@RequestParam String origin) {
		return ResponseEntity.ok(this.service.findAllDestinies(origin));
	}

}
