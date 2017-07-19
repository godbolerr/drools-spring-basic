/**
 * 
 */
package com.work.findrools.rules;

import java.io.Serializable;

/**
 * @author 115750
 *
 */
public class PolicyInfo implements Serializable {
	
	Driver driver;
	
	Policy policy;

	/**
	 * 
	 */
	public PolicyInfo() {
		// TODO Auto-generated constructor stub
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	
}
