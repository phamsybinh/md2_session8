package BTVN.bai1;

public class Run {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("thanh",25,4);
        System.out.println(partTimeEmployee.getName()+"\nluong "+partTimeEmployee.calculateSalary());
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("truong",30);
        System.out.println(fullTimeEmployee.getName()+"\nluong "+fullTimeEmployee.calculateSalary());
    }
}
