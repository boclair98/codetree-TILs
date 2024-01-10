import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr = new int[101];
        int[] arr2 = new int[101];

        for(int i = 0 ; i<n1; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        boolean re = false;
        for(int i = 0 ; i<=n1 - n2 ; i++){
            int cnt = 0;
            for (int j = 0 ; i<n2; j++){
                if (arr[i+j] == arr2[j]){
                    cnt++;
                }
                else{
                    break;
                }
            }
            if (cnt == n2){
                re = true;
            }
        }
        if (re){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
    }
}