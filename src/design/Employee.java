package design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//employeeId() will return employee id.
	public int employeeId();
	
	//employeeName() will return employee name
	public String employeeName();
	
	//assignDepartment() will assign employee to departments
    public void assignDepartment();
	
	//calculate employee salary
	public int calculateSalary();
	
	//employee benefit
	public void benefitLayout();

}

class emp implements Employee{

	              private String name;
	              private int id;
	               private int dno;
	                 private int rate;
	                private int sal;

	public String    getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getDno() {
		return dno;
	}

	public int getSal() {
		return sal;
	}

	public int getRate() {
		return rate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String employeeName() {return "";}
	public int employeeId(){ return 0;}

	public int hours(int a){return a;}
	public void assignDepartment()       {
		System.out.println();
	}
	public int calculateSalary(){return 0;}
	public void benefitLayout() {}
}