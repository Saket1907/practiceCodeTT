import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//Given a list of employees with their names, department, and salary, write a java 8 stream-based function to find the highest paid employee in each department. The input will be a list of employee objects, and output should be a Map where the key is the department and value are the highest paid employee in that department.

class Employee {

	String empName;
	int empSal;
	String empDept;

	public Employee(String empName, int empSal, String empDept) {
		super();
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

}

public class Zen {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Employee> myEmployeeList = new ArrayList<Employee>();
		myEmployeeList.add(new Employee("Saket", 458, "Eng"));
		myEmployeeList.add(new Employee("Kumar", 460, "IT"));
		myEmployeeList.add(new Employee("Dheraj", 586, "Eng"));
		myEmployeeList.add(new Employee("Ravi", 459, "IT"));

		Map<String, Employee> myMap = myEmployeeList.stream().collect(Collectors.groupingBy(e -> e.empDept, Collectors
				.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e -> e.getEmpSal())), Optional::get)));

		//myMap.entrySet().stream().forEach((k, v) -> System.out.println((String) k.getEmpDept +" "+v));

		// System.out.println(myEmployeeList.stream().collect(Collectors.groupingBy(e ->
		// e.empDept,
		// Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e ->
		// e.getEmpSal())), Optional::get))));
	}

}
