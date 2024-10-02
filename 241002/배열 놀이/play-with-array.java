import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<q; i++){
            int s = sc.nextInt();
            if(s==1 ){
                int b = sc.nextInt();
                System.out.println(arr[b-1]);
            }else if(s==3){
                int b = sc.nextInt();
                int c = sc.nextInt();
                for(int z =b-1; z<c; z++){
                    System.out.print(arr[z]+" ");
                }
            } else if(s==2){
                int b = sc.nextInt();
                int idx = -1;
                for(int k = 0; k<b; k++){
                    if(arr[k]==b){
                        idx = k+1;
                        break;
                    }
                }
                if(idx ==-1){
                    System.out.println(0);
                }else{
                    System.out.println(idx);
                }
            }
            
        }

    }
}