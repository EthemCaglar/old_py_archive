package Fabrika;

public class Employee { 
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours,int hireYear){
        // constructor method
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){ // vergi uygulama
        if(this.salary >= 1000){
            this.salary = this.salary * 0.97;
        }
    }

    public void bonus(){ // bonus uygulama
        if(this.workHours >= 40){
            this.salary = this.salary + (this.workHours-40)*30;
        }
    }

    public void raiseSalary(){ // şuanki yıl 2021 yıla göre maaş değişimi
        if(2021 - this.hireYear > 10){
            this.salary = this.salary*1.1;
        }else if(2021 - this.hireYear > 20){
            this.salary = this.salary*1.15;
        }else{
            this.salary = this.salary*1.05;
        }
    }

    public void print(){ // yazdırma
        System.out.println("-------Employee Profile-------");
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
    }
}


