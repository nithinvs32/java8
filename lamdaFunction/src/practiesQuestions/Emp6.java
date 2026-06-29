package practiesQuestions;

import java.util.Comparator;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Emp6 {
	public static void main(String[] args) {
		EmployeeBySal L1 = new EmployeeBySal();
		List<Double> list = Li.stream()
				.filter(e -> e.getCompany().equalsIgnoreCase("Wipro"))
				.map(Employee::getSalary)
				.collect(Collectors.toList());

		System.out.println(list);
	}

}
