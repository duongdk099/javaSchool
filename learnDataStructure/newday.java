/**
 * newday
 */
public class newday {
    public static void afficherArray( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println("\n");
    }
    public static void firstTri(int[] arr){
        int min = 0;
        int tmp = 0;
        int posMin = 0;
        //
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            // vòng for này để tìm số bé nhất 
            for (int j = (i+1); j < arr.length; j++) {
                if(min > arr[j]){ 
                    min = arr[j];
                    posMin = j;
                }
            }
            // swap số bé nhất với pos[i]
            tmp = arr[posMin];
            arr[posMin] = arr[i];
            arr[i] = tmp;
        }
        System.out.println("Affichage :" );
        afficherArray(arr);
    }
    public static void secondTri(int[] arr){
        int min = 0;
        int tmp = 0;
        int max = 0;
        int posMin = 0;
        int posMax = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            max = arr[i];
            // vòng for này để tìm số bé nhất 
            for (int j = (i+1); j < arr.length; j++) {
                if(min > arr[j]){ 
                    min = arr[j];
                    posMin = j;
                }
            }
            // swap số bé nhất với pos[i]
            tmp = arr[posMin];
            arr[posMin] = arr[i];
            arr[i] = tmp;
            // vòng for này để tìm số lớn nhất
            /*for (int j = 0; j < arr.length; j++) {
                if(max < arr[j]){
                    max = arr[j];
                    posMax = j;
                }
            }
            
            // swap số lớn nhất vs pos[arr.length -i-1]
            tmp = arr[posMax];
            arr[posMax] = arr[(arr.length-i-1)];
            arr[arr.length - i - 1] = tmp;*/
        }
        System.out.println("Affichage :" );
        afficherArray(arr);
    }
    public static void main(String[] args) {
        
        int arr[] = {53,23,89,13,97,5,18,46};
        /*
        int min = 0;
        int tmp = 0;
        int posMin = 0;
        //
        for (int i = 0; i < arr.length; i++) {
            int posMtn = arr[i];
            min = arr[i];
            // vòng for này để tìm số bé nhất 
            for (int j = (i+1); j < arr.length; j++) {
                if(min > arr[j]){ 
                    min = arr[j];
                    posMin = j;
                }
            }
            // swap số bé nhất với pos[i]
            tmp = arr[posMin];
            arr[posMin] = arr[i];
            arr[i] = tmp;
        }
        */
        afficherArray(arr);
        //firstTri(arr);
        secondTri(arr);
        /*
        trong vòng for đầu có i=0
        pos = 53
        min = 53
        trong vòng for thứ 2 có j=1
        so sánh min vs arr.2
        min > arr.2
        min = arr.2
        trong vòng for thứ 2 có j=2
        so sánh min vs arr.3
        min < arr.3 => min giữ
        =>>> min = số bé nhất
        swap
        tmp = 5
        min = 53
        pos = 5
        n/vụ ở đoạn line 20 trở đi là swap pos min vs pos của arr.i

        */
    }
}