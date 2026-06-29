package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q11 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

List<String> ans=L1.stream().filter(e->e.getCompany().equalsIgnoreCase("Wipro")).filter(e->e.getSalary()>25000).map(Employee::getName).sorted().collect(Collectors.toList());System.out.println(ans);
    }
}
