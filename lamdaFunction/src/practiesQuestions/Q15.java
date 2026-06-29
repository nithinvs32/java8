package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q15 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

System.out.println("Greater="+L1.stream().filter(e->e.getSalary()>40000).mapToDouble(Employee::getSalary).sum());System.out.println("Less="+L1.stream().filter(e->e.getSalary()<40000).mapToDouble(Employee::getSalary).sum());
    }
}
