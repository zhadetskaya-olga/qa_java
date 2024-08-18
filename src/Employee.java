public class Employee {
    private String name;
    private String position;
    private String phone_number;
    private String email;
    private int salary;
    private int age;

    public Employee(String name, String position, String phone_number, String email, int salary, int age){
        this.name = name;
        this.position = position;
        this.phone_number = phone_number;
        this.email = email;
        this.salary = salary;
        this.age = age;

    }

    public void PrintInfo(){
        System.out.println("ФИО сотрудника: " + name + "\n" + "Должность: " + position + "\n" + "Телефон: " + phone_number + "\n" + "Email: " + email + "\n" + "Зарплата: " + salary + "\n" + "Возраст: " + age);
    }

}