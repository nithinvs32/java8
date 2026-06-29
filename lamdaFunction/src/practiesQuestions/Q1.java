package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q1 {
	public static void main(String[] args) {
		EmployeeBySal obj = new EmployeeBySal();
		List<Employee> L1 = obj.emps;

		List<Double> ans = L1.stream().filter(e -> e.getCompany().equalsIgnoreCase("Wipro")).map(Employee::getSalary)
				.collect(Collectors.toList());
		System.out.println(ans);
	}
}
