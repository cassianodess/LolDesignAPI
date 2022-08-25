package cassianodess.github.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cassianodess.github.models.Code;

@Repository
public interface CodeRepository extends JpaRepository<Code, Integer> {
	@Query(value = "SELECT * FROM CODE where ORIGIN = ?1 and DESTINY = ?2", nativeQuery = true)
	Code retriveTax(String origin, String destiny);

}
