package practiesQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class Empinfosys {

	public static void main(String[] args) {
		EmployeeBySal E1 = new EmployeeBySal();
		List<Employee> L1 = E1.emps;

		List<Double> wiproSalary = L1.stream().filter(e -> e.getCompany().equals("Wipro"))
				.map(Employee -> Employee.getSalary()).collect(Collectors.toList());

		System.out.println("Wipro Salaries : " + wiproSalary);

	}

}
