import java.util.Arrays;

public class Test {
//    static int arr[]=new int[]{1,2,3,4,5};
  static   void rotate(int arr[],int p,int d) {
      int temp;
      int i;
      int N=arr.length;
    while(p>=0)
    {
        if(d==0)
        {
            temp = arr[0];
            for(i=0; i < N - 1; i++)
                arr[i] = arr[i + 1];

            arr[N - 1] = temp;
        }
        else
        {
            temp = arr[N - 1];
            for(i = N - 1; i > 0; i--)
                arr[i] = arr[i - 1];

            arr[0] = temp;
        }

        p--;
    }

      System.out.println("Array after shift operation ...\n");
        System.out.println( Arrays.toString(arr));


}
//        int x = arr[arr.length - p], i;
//        if (p > 0 && p < N && d == 2) {
//
//                for (i = arr.length - 1; i >1; i--) {
//
//                    arr[i - p + 1] = arr[i];
//
//            }














//            arr[0] = x;
//            System.out.println(Arrays.toString(arr));
//        }
//        else {
//                for (i = arr.length - p; i > 0; i--)
//                    arr[i] = arr[i -1];
//                arr[0] = x;
//            System.out.println(Arrays.toString(arr));
//            }



        }



