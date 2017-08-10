/**
 * 
 */
package com.work.findrools.rules;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DroolsServiceImpl implements DroolsService {

	@Autowired
	private KieContainer kc;

	/**
	 * 
	 */
	public DroolsServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.work.findrools.service.DroolsService#calculateRisk(com.work.findrools
	 * .rules.Driver, com.work.findrools.rules.Policy)
	 */
	@Override
	public PolicyInfo calculateRisk(Driver driver, Policy policy) {

		// This is default one
		
		KieSession ksession = kc.getKieBase("FindDroolsSessionDecisionTableKb").newKieSession();

		KieRuntimeLogger kieLogger = KieServices.Factory.get().getLoggers().newFileLogger(ksession, "audit");

		
		ksession.insert(driver);
		ksession.insert(policy);
		
		ksession.fireAllRules();
		
		PolicyInfo info = new PolicyInfo();
		
		info.setDriver(driver);
		info.setPolicy(policy);
		System.out.println(driver + ":" + policy);
		kieLogger.close();
		
		return info;
	}

	@Override
	public String calculateRiskForNewDrivers(Driver driver, Policy policy) {
		
		KieSession ksession = kc.newKieSession("FindDroolsSession");

		ksession.insert(driver);
		ksession.insert(policy);
		
		ksession.fireAllRules();
		
		return "Executed Successfully " + policy + " for drive " + driver;
	}

	@Override
	public String calculateRiskForNewDriversDecisionTable(Driver driver, Policy policy) {
		KieSession ksession = kc.newKieSession("FindDroolsSessionDecisionTable");

		ksession.insert(driver);
		ksession.insert(policy);
		
		ksession.fireAllRules();
		
		return "Executed Successfully " + policy + " for drive " + driver;
	}

	@Override
	public FinPerson calculateBenefits(FinPerson person) {
		// TODO Auto-generated method stub
		return person;
	}

}
