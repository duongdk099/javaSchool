public class exercice7 {
    public static void main(String[] args) {
        int [] arr = {53,23,89,13,97,5,18,46};
        int tmp = 0;
        //System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            
            for (int j = i+1; j < arr.length; j++) {
                if ( min > arr[j] ) {
                    min = arr[j];
                }
            }
            // swap
            tmp = arr[i];
            arr[i] = min;
            min = tmp; 
        }
        for(int i=0;i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
