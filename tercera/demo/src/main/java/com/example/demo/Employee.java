package com.example.demo;

public class Employee {

	public String EMPLOYEE_ID;
	   public String FIRST_NAME;
	   public String LAST_NAME;
	   public String EMAIL;
	   public String PHONE_NUMBER;
	   public String HIRE_DATE;
	   public String JOB_ID;
	   public String SALARY;
	   public String COMMISSION_PCT;
	   public String MANAGER_ID;
	   public String DEPARTMENT_ID;
	public Employee(String eMPLOYEE_ID, String fIRST_NAME, String lAST_NAME, String eMAIL, String pHONE_NUMBER,
			String hIRE_DATE, String jOB_ID, String sALARY, String cOMMISSION_PCT, String mANAGER_ID,
			String dEPARTMENT_ID) {
		super();
		EMPLOYEE_ID = eMPLOYEE_ID;
		FIRST_NAME = fIRST_NAME;
		LAST_NAME = lAST_NAME;
		EMAIL = eMAIL;
		PHONE_NUMBER = pHONE_NUMBER;
		HIRE_DATE = hIRE_DATE;
		JOB_ID = jOB_ID;
		SALARY = sALARY;
		COMMISSION_PCT = cOMMISSION_PCT;
		MANAGER_ID = mANAGER_ID;
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	   
	   
}
