package com.work.findrools.rules;

import com.work.findrools.rules.Driver;
import com.work.findrools.rules.Policy;
import com.work.findrools.rules.PolicyInfo;

/**
 * Service Interface for managing Person.
 */
public interface DroolsService {
	
	public PolicyInfo calculateRisk(Driver d, Policy p);
	
	public String calculateRiskForNewDrivers(Driver d, Policy p);
	public String calculateRiskForNewDriversDecisionTable(Driver d, Policy p);

}
