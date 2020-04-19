public class arraytest {

    public static void main(String[] args){

        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i=0; i <= 2; i++){
            System.out.println(arr[i]);
        }


        int arr2[] = {20, 30, 25, 35, -16, 60, -100};
        double sum = 0;
        for (int j=0 ; j <= 6; j++){
            sum += arr2[j];
        }
        System.out.println("The average of these 7 numbers is " + sum/7 );

    }
}
