import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0 ; i<n1; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        

        for(int i = 0 ; i<n1; i++){
            boolean check = true;    
            for(int j = 0; j<n2; j++){
                if(arr[i+j]!=arr2[j]){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.print("Yes");
                System.exit(0);
            }

        }
        System.out.print("No");


    }
}