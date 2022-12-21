package in.reports.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.reports.bindings.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
