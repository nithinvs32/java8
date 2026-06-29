package lamdaFunction;

import java.util.*;
import java.util.stream.Collectors;

public class hsus {
	public static void main(String[] args) {

		Employe e1 = new Employe("Ramesh", "Wipro", 36500);
		Employe e2 = new Employe("Suresh", "TCS", 37500);
		Employe e3 = new Employe("Raj", "TCS", 55000);
		Employe e4 = new Employe("Krishna", "Wipro", 35800);
		Employe e5 = new Employe("Surya", "Infosys", 42900);
		Employe e6 = new Employe("Chandra", "Capgemini", 25800);
		Employe e7 = new Employe("Ramesh", "Wipro", 36500);
		List<Employe> l1 = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);
		DoubleSummaryStatistics x1 = l1.stream().collect(Collectors.summarizingDouble(emp -> emp.salary));
		System.out.println(x1.getMax());
		System.out.println(x1.getMin());
		System.out.println(x1.getSum());
		System.out.println(x1.getAverage());
		System.out.println(x1.getCount());
	}
}
