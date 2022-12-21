package in.reports.service;

import java.util.List;

import in.reports.bindings.Entries;
import in.reports.bindings.Plan;

public interface PlanService {

	public List<Plan> getplanName(String planName);

	public Plan getplanStaus(String planStatus);
}
