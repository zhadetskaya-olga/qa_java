public class ClassFillDiagonal {
    public void fillDiagonal(int arr[][]){
        for(int i = 0; i < arr.length ; i++){
            int a = arr.length;
            for(int k = 0; k < arr.length ; k++){
                int sum = i + k ;
                if(i == k || sum == a - 1 ){
                    arr[i][k] = 1;
                }
                else {
                    arr[i][k] = 0;
                }
                System.out.printf("%4d", arr[i][k]);


                }
                System.out.println();
            }
        }
    }

