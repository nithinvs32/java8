package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q19 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

System.out.println("Below50="+L1.stream().filter(e->e.getSalary()<50000).count());System.out.println("50to80="+L1.stream().filter(e->e.getSalary()>=50000&&e.getSalary()<=80000).count());System.out.println("Above80="+L1.stream().filter(e->e.getSalary()>80000).count());
    }
}
