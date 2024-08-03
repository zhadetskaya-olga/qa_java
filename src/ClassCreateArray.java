public class ClassCreateArray {
    public void createArray(int len, int initialValue){
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = initialValue;
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
