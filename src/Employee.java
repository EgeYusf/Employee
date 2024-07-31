//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Employee {
        public String name;
        public String graduate;
        public double salary;
        public int workHours,hireYear;


        Employee(String name, String graduate,double salary,int workHours,int hireYear){
               this.name = name;
               this.graduate = graduate;
               this.salary = salary;
               this.workHours = workHours;
               this.hireYear = hireYear;

        }
        public double tax(){
            if (salary > 2460){
                return salary * 0.099;
            }else{
                return 0;
            }
        }

        public double bonus(){
            int extraHours = workHours - 52;
            if (extraHours > 0){
                return 65 * this.workHours;
            }else{
                return 0;
            }

        }

        public double increase(){
            int year = 2024 - this.hireYear;
            if (year < 5){
                return salary * 0.5;
            }else if (year >= 10 && year < 20){
                return salary * 0.15;
            }else if (year >=20 && year < 30){
                return salary * 0.20;
            }else{
                return salary * 0.25;
            }
        }
}