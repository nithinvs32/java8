package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q17 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

System.out.println("Wipro="+L1.stream().filter(e->e.getCompany().equalsIgnoreCase("Wipro")).mapToDouble(Employee::getSalary).sum());System.out.println("Others="+L1.stream().filter(e->!e.getCompany().equalsIgnoreCase("Wipro")).mapToDouble(Employee::getSalary).sum());
    }
}
