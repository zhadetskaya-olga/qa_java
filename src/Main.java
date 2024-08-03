

public class Main {
    public static void main(String[] args) {
      ClassThreeWords obj = new ClassThreeWords();
        obj.printThreeWords();

      ClassCheckSum obj1 = new ClassCheckSum();
        obj1.checkSumSign();

        ClassPrintColor obj2 = new ClassPrintColor();
        obj2.printColor();

        ClassCompareNum obj3 = new ClassCompareNum();
        obj3.compareNumbers();

        ClassIsWithinRange obj4 = new ClassIsWithinRange();
        obj4.IsWithinRange(5, 8);

        ClassIsPositive obj5 = new ClassIsPositive();
        obj5.IsPositive(6);

        ClassIsNegative obj6 = new ClassIsNegative() ;
        obj6.isNegative(1);

        ClassPrintString obj7 = new ClassPrintString();
        obj7.printString("string", 10);

        ClassIsLeapYear obj8 = new ClassIsLeapYear();
        obj8.isLeapYear(1100);

        ClassArrayReplace obj9 = new ClassArrayReplace();
        int[] arr = new int[] {1,0,0,1};
        obj9.arrayRepl(arr);

        ClassFillArray obj10 = new ClassFillArray();
        int[] array = new int[100];
        obj10.fillArray(array);

        ClassMultiplyBy2 obj11 = new ClassMultiplyBy2();
        int[] arr1 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        obj11.multiplyBy2(arr1);

        ClassFillDiagonal obj12 = new ClassFillDiagonal();
        int[][] arr2 = new int[4][4];
        obj12.fillDiagonal(arr2);

        ClassCreateArray obj13 = new ClassCreateArray();
        obj13.createArray(10, 1);
}
}
