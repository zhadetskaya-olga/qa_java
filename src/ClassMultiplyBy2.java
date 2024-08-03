public class ClassMultiplyBy2 {
    public void multiplyBy2 (int array[]){
        for(int i = 0; i < array.length; i++){
            if (array[i] < 6) {
                array[i] = array[i]*2;
            }
            System.out.println(array[i]);
            System.out.println();
        }

    }
}
