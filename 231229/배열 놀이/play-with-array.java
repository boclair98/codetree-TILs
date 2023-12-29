import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        } 
        int first = 0 ;
        int second = 0 ;
        for(int i = 0 ; i<q; i++){
            int a = sc.nextInt();
            if (a == 1){
                int b = sc.nextInt();
                System.out.println(arr[b-1]);

                
            }

            else if(a==2){
                int c = sc.nextInt();
                int idx = -1;
                for(int s = 0 ; s<n; s++){
                    if (arr[s] == c){
                        idx = s;
                        break;
                        

                    }
            
                }
                System.out.println(idx+1);
            }


            else if (a==3){
                int h = sc.nextInt();
                int e = sc.nextInt();
                for(int z = h-1 ; z<e; z++){
                    System.out.print(arr[z]+" ");
                }
            }
        }
    }
}