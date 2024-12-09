import java.util.*;
public class Main {
    public static int n,m,total;
    public static int[] arr1;
    public static int[] arr2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr1 = new int[10000001];
        arr2 = new int[10000001];
        int idx1 = 1;
        int idx2 = 1;
        for(int i = 0; i<n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int s = 0 ; s<t; s++){
                arr1[idx1] = arr1[idx1-1] + v;
                idx1++;
            }
        }

        for(int i = 0; i<m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int s = 0 ; s<t; s++){
                arr2[idx2] = arr2[idx2-1] + v;
                idx2++;
            }
        }

        // for(int i = 0; i<10; i++){
        //     System.out.println(arr1[i]+" "+arr2[i]);
        // }
        
        int change=0, count = 0;
        for(int i =1; i<idx1; i++){
            if (arr1[i] > arr2[i]){
                if (change !=1){
                    count++;
                }
                change = 1;
            }else if(arr1[i] < arr2[i]){
                if (change !=2){
                    count++;
                }
                change = 2;
            }else if (arr1[i] == arr2[i]){
                if(change !=3){
                    count++;
                }
                change = 3;
            } else if(arr1[i] == 0 && arr2[i] == 0){
                break;
            }
        }
        System.out.print(count);

    }
}