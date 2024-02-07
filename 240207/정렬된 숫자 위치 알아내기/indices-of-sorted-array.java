import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] new_arr =arr.clone();
        Arrays.sort(arr);
        int[] answer = new int[n];
        String[] visited = new String[n];

        for (int i = 0 ; i<n; i++){
            visited[i] ="false";
        }

        for(int i = 0; i<n;i++){

            for (int j = 0 ; j<n; j++){
                if (new_arr[i] == arr[j] && visited[j].equals("false")){
                    answer[i] = j+1;
                    visited[j] ="true";
                    break;
                    
                }
            }
        }

        for(int i = 0; i<n; i++){
            System.out.print(answer[i]+" ");
            
            
        }
        
    }

}