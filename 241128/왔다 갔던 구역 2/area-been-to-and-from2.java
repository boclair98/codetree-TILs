import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[201];
        int now = 100;
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            char word = sc.next().charAt(0);
            if(word == 'R'){
                for(int s =now; s<now+a; s++){
                    arr[s] = arr[s] + 1;
                }
                now = now + a;
            }else{
                for(int s = now-1; s > now-a; s--){
                    arr[s] = arr[s] + 1;
                }
                now = now - a;
            }
        }
        int count = 0;
        for(int i =1; i<201; i++){
            if(arr[i]>=2){
                count++;
            }
        }
        System.out.print(count);

                
    }
}