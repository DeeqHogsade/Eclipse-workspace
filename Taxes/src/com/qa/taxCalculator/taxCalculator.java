package com.qa.taxCalculator;

public class taxCalculator {
	float rate = 0f;
	float tax = 0f;
	float salary = 35000; 
	

//	public static float taxRate(float rate) {
//		if (salary < 15000) {
//			rate = 0;
//			return rate;
//		} else if (salary >= 15000 && salary < 20000) {
//			rate = 0.1f;
//			return rate;
//		} else if (salary >= 20000 && salary < 30000) {
//			rate = 0.15f;
//			return rate;
//		} else if (salary >= 30000 && salary < 45000) {
//			rate = 0.2f;
//			return rate;
//		} else
//			rate = 0.25f;
//		return rate;
//
//	}

	public float taxAmount() {
		if (salary < 15000) {
			rate = 0;
			return tax;
		} else if (salary >= 15000 && salary < 20000) {
			rate = 0.1f;
			tax = salary * rate;
			return tax;
		} else if (salary >= 20000 && salary < 30000) {
			rate = 0.15f;
			tax = salary * rate;
			return tax;
		} else if (salary >= 30000 && salary < 45000) {
			rate = 0.2f;
			tax = salary * rate;
			return tax;
		} else {
			rate = 0.25f;
			tax = salary * rate;
			return tax;
		}

	}
}
