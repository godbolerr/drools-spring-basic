package com.work.findrools.rules;

import java.math.BigDecimal;
import java.util.Date;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy")
public class PolicyController {

	private DroolsService dService;

	@Inject
	public PolicyController(DroolsService dService) {
		this.dService = dService;
	}

	@RequestMapping(value = "/check", method = { RequestMethod.POST })
	public PolicyInfo checkOrder(@RequestBody PolicyInfo info) {
		return dService.calculateRisk(info.getDriver(), info.getPolicy());
	}

	@RequestMapping(value = "/benefits", method = { RequestMethod.GET })
	public FinPerson getBenefits() {

		FinPerson fPerson = new FinPerson("Raja Gosavi", new Date(), FiConstants.GENDER_MALE, FiConstants.RELATIONSHIP_SELF, 0, "");
		
		
		
		
		fPerson.setEmail("rgosavi@gmail.com");
		fPerson.setContactNumber("+1 998 889 8888");
		fPerson.setAadharNumber("9998887878");
		fPerson.setPanNumber("OPDID9987A");
		fPerson.setResidentialStatus("INDIAN");
		fPerson.setMaritalStatus("MARRIED");
		fPerson.setEmploymentType("GOV");
		fPerson.setSalaryBasicPerMonth(BigDecimal.valueOf(3939));		
		fPerson.setSalaryPerAnum(BigDecimal.valueOf(49494949));
		fPerson.setPpfContributionPerMonth(BigDecimal.valueOf(4848));
		fPerson.setDearnessAllowancePerMonth(BigDecimal.valueOf(4949));
		fPerson.setPensionContributionPerMonth(BigDecimal.valueOf(9695));
		

		fPerson.addDonation(new Donation(BigDecimal.valueOf(1000), "XX", "Money Given to charity 1"));
		fPerson.addDonation(new Donation(BigDecimal.valueOf(500), "YY", "PM Relief Fund"));
		fPerson.addIncome(new Income(BigDecimal.valueOf(1939), "Book", "Income from books"));
		fPerson.addIncome(new Income(BigDecimal.valueOf(111), "Patent", "Patent for new work"));
		fPerson.addLoan(new Loan(BigDecimal.valueOf(34949), BigDecimal.valueOf(24555), BigDecimal.valueOf(3455567),
				"HOUSING", "sbi", "33", new Date(), new Date()));
		fPerson.addPropertyDetails(new PropertyDetails("X House", "Pune", "OWN"));

		
		fPerson.setAddress(new Address("510 Bldg B", "Sea Colony", "Mumbai", "MH", "INDIA", "444001", "Near Rly Station", "PERSONAL"));
		
		fPerson.addChildren(new Person("Lata", new Date(), "Female", "WIFE", 0, ""));
		fPerson.addChildren(new Person("Sham", new Date(), "Male", "SON", 0, ""));
		fPerson.addChildren(new Person("Sita", new Date(), "Female", "DAUGHTER", 0, ""));
		
		fPerson.addDependent(new Person("Sitaram", new Date(), "Male", "FATHER", 20, "xxx"));
		fPerson.addDependent(new Person("Gauri", new Date(), "Female", "MOTHER", 90, "yyy"));
		
		
		return fPerson;

	}

}
