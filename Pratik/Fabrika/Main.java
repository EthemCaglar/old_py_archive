package Fabrika;

public class Main {
    public static void main(String[] args) { // Çalışanların Belirlenmesi
    Employee employee1 = new Employee("Tolunay Ören", 1400, 36, 2015);
    Employee employee2 = new Employee("Hasan Arda Kaşıkçı", 2000, 45, 2003);
    Employee employee3 = new Employee("Kenan Karaman", 200, 5, 2020);
    // ilk yazdırma
    employee1.print();
    employee2.print();
    employee3.print();
    // method uygulama
    employee1.tax();
    employee1.bonus();
    employee1.raiseSalary();

    employee2.tax();
    employee2.bonus();
    employee2.raiseSalary();

    employee3.tax();
    employee3.bonus();
    employee3.raiseSalary();
    // tekrar yazdırma
    employee1.print();
    employee2.print();
    employee3.print();

    }
}
