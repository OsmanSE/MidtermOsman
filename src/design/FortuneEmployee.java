package design;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		String mission = "To support, guide, and let you lead";
		String vision = "Be a great place to work where people are inspired to be the best they can be.";

		EmployeeInfo emp1 = new EmployeeInfo("Mrs. Sawakin", 10);
		EmployeeInfo emp2 = new EmployeeInfo("Ms.  Nouria Ali", 12);
		EmployeeInfo emp3 = new EmployeeInfo("Mr. Farih S", 11);
		EmployeeInfo emp4 = new EmployeeInfo("Ms. Zubaida", 14);
		EmployeeInfo emp5 = new EmployeeInfo("Mrs. Suleiman Abidove", 13);

		emp1.setDepartmentName("R&D");
		emp2.setDepartmentName("HR");
		emp3.setDepartmentName("Finance");
		emp4.setDepartmentName("IT");
		emp5.setDepartmentName("Marketing");

		emp1.setSalary(7000);
		emp1.calculateSalary(emp1.getSalary());
		emp2.setSalary(9000);
		emp2.calculateSalary(emp2.getSalary());
		emp3.setSalary(10000);
		emp3.calculateSalary(emp3.getSalary());
		emp4.setSalary(12000);
		emp4.calculateSalary(emp4.getSalary());
		emp5.setSalary(9500);
		emp5.calculateSalary(emp5.getSalary());

		emp1.companyMission(mission);
		emp1.companyVission(mission, vision);

		emp1.setPerformance(5);
		double bonus101 = emp1.calculateEmployeeBonus(emp1.getSalary(), emp1.getPerformance());
		emp2.setPerformance(4);
		double bonus102 = emp2.calculateEmployeeBonus(emp2.getSalary(), emp2.getPerformance());
		emp3.setPerformance(3);
		double bonus103 = emp3.calculateEmployeeBonus(emp3.getSalary(), emp3.getPerformance());
		emp4.setPerformance(2);
		double bonus104 = emp4.calculateEmployeeBonus(emp4.getSalary(), emp4.getPerformance());
		emp4.setPerformance(1);
		double bonus105 = emp4.calculateEmployeeBonus(emp5.getSalary(), emp5.getPerformance());

		EmployeeInfo.calculateEmployeePension(emp1.getSalary());

		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> employeeRecord101 = new ArrayList<Object>();
		employeeRecord101.add(emp1.getEmployeeName());
		employeeRecord101.add(emp1.calculateSalary(emp1.getSalary()));
		employeeRecord101.add(bonus101);

		List<Object> employeeRecord102 = new ArrayList<Object>();
		employeeRecord102.add(emp2.getEmployeeName());
		employeeRecord102.add(emp2.calculateSalary(emp2.getSalary()));
		employeeRecord102.add(bonus102);

		employeeInfo.put(101, employeeRecord101);
		employeeInfo.put(102, employeeRecord102);

		//ConnectToMongoDB connectDB = new ConnectToMongoDB();

		//ConnectToMongoDB.insertIntoToMongoDB("employee_record", "employee_id", "employee_info");

		for (Integer obj : employeeInfo.keySet()) {
			for (Object obj1 : employeeInfo.get(obj)) {
				System.out.println(obj1);
				List<String> list1 = new ArrayList<>();
				list1.add(obj.toString());
				list1.add(obj1.toString());
				//	ConnectToMongoDB.insertIntoToMongoDB(list1, "employee_record", "employee_id", "employee_info");
			}

		}
		System.out.println("Reading from database");
		/////List<String> empRec = ConnectToMongoDB.readUserProfileFromMongoDB("employee_record", "employee_id", "employee_info");
		/////	for (String emp : empRec) {
		//////	System.out.println(emp);
	}


}





