package cassianodess.github.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cassianodess.github.models.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer> {
	@Query(value = "SELECT TALK_MORE_PLAN  FROM PLAN;", nativeQuery = true)
	List<Integer> findAllPlans();

	@Query(value = "SELECT DESTINY FROM CODE WHERE ORIGIN = ?1", nativeQuery = true)
	List<String> findAllDestinies(String origin);
}
