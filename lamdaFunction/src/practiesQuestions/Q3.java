package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q3 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

List<Employee> ans=L1.stream().filter(e->e.getCompany().equalsIgnoreCase("TCS")||e.getCompany().equalsIgnoreCase("Wipro")).filter(e->e.getSalary()>=30000&&e.getSalary()<=70000).map(e->new Employee(e.getName(),e.getCompany(),e.getSalary()*1.2)).collect(Collectors.toList());ans.forEach(System.out::println);
    }
}
