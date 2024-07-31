public class EmpManager {
    public static void main(String[]args){
        Employee empl1 = new Employee("Ege","University",4240,59,2001);
        System.out.println("Name : " + empl1.name);
        System.out.println("Graduate : " + empl1.graduate);
        System.out.println("Tax : " + empl1.tax());
        System.out.println("Bonus : " + empl1.bonus());
        System.out.println("Salary increase : " + empl1.increase());
        double totalSalary = empl1.salary + empl1.bonus() - empl1.tax();
        System.out.println(totalSalary);
        System.out.println("Total salary with the only raise : " + empl1.salary+empl1.increase());



    }
}
