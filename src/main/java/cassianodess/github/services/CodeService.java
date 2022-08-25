package cassianodess.github.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cassianodess.github.models.Code;
import cassianodess.github.repository.CodeRepository;

@Service
public class CodeService {

	@Autowired
	private CodeRepository repository;

	public Code retrieveTax(String origin, String destiny) {

		return this.repository.retriveTax(origin, destiny);

	}

}
