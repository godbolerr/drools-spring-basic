/**
 * 
 */
package com.work.findrools.rules;

import java.math.BigDecimal;

/**
 * @author 115750
 *
 */
public class Donation {

	/**
	 * Amount donated.
	 * 
	 */
	BigDecimal amount;
	
	/**
	 * Type of institution to which amount is donated
	 */
	
	String type;
	
	/**
	 * Other details about an institution.
	 */
	
	String details;

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
	
}
