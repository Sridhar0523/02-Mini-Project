package in.reports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.reports.bindings.Plan;

@Service
public class PlanServiceImpl implements PlanService {
	
	@Autowired
	private PlanService planService;

	@Override
	public List<Plan> getplanName(String planName) {
		List<Plan> getplanName = planService.getplanName(planName);
		return getplanName;
	}

	@Override
	public Plan getplanStaus(String planStatus) {
		Plan getplanStaus = planService.getplanStaus(planStatus);
		return getplanStaus;
	}

	
}
