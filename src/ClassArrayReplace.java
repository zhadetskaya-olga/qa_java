public class ClassArrayReplace {
    public void arrayRepl(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
