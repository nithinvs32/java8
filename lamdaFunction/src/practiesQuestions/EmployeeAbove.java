package practiesQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeAbove {
	public static void main(String[] args) {
		EmployeeBySal E1 = new EmployeeBySal();
		List<Employee> L1 = E1.emps;

		List<String> multipleOf10k = L1.stream().filter(e -> e.getSalary() % 10000 == 0).map(Employee::getName)
				.collect(Collectors.toList());

		System.out.println("Salary multiple of 10k : " + multipleOf10k);

	}

}
