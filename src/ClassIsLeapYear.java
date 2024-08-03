public class ClassIsLeapYear {
    public void isLeapYear(int year){
        boolean isLeap = false;
        int remainder = year % 4;
        if(remainder == 0 && year % 100 != 0 || year% 400 == 0 ){
            isLeap = true;
            System.out.println(isLeap);
        }
        else{
            System.out.println(isLeap);
        }
        System.out.println();
    }
}
