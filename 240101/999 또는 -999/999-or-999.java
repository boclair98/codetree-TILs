import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        

        for(int i = 0 ; i<100; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==999 || arr[i]==-999){
                break;
            }
           
        }

        int max_val = arr[0];
        int min_val = arr[0];

        for(int i = 1 ; i<100; i++){
            if(arr[i]==999 || arr[i]==-999){
                break;
            }

            if(arr[i]>max_val){
                max_val = arr[i];
            }
            if(arr[i]<min_val){
                min_val = arr[i];
            }
        }

        System.out.print(max_val+" "+min_val);
    
    }
}