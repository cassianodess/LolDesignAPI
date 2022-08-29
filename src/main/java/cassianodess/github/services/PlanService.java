package cassianodess.github.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cassianodess.github.repository.PlanRepository;

@Service
public class PlanService {

	@Autowired
	private PlanRepository repository;

	public List<Integer> findAllPlans() {
		return this.repository.findAllPlans();
	}
	
	public List<String> findAllDestinies(String origin) {
		return this.repository.findAllDestinies(origin);
	}

}
