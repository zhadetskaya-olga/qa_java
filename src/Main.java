//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Employee employee_1 = new Employee("Ivan", "HR Manager", "+37529976578","qwer@gmail.com" ,2200, 35);
    employee_1.PrintInfo();

    Employee[] array = new Employee[5];
    array[0] = new Employee("Eren Jaeger", "CEO", "+37529976578","eren@gmail.com" ,25600, 22);
        array[0] = new Employee("Armin Alert", "Secretary", "+3752945778","armin@gmail.com" ,1200, 21);
        array[1] = new Employee("Vasili Pupkin", "Dev engineer", "+37529976578","vasia@gmail.com" ,800, 27);
        array[2] = new Employee("Tartaglia Childe", "chief accountant", "88005553535","ilovemoney@gmail.com" ,220000, 25);
        array[3] = new Employee("Bai Zhu", "Nurse", "+37588906678","dr.zhu@gmail.com" ,2700, 23);
        array[4] = new Employee("Sasha Braus", "Chef", "+3758777678","potato@gmail.com" ,2900, 23);


        Park park = new Park();
        Park.all_attractions[0] = park.new Attractions("Карусель","с 9 до 5", "5 рублей с человека" );


    }
}