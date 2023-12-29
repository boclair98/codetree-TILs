import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int num = 0 ;
        int[] arr = new int[5];
        for(int i = 0 ; i<3; i++){
            char c = sc.next().charAt(0);
            int n = sc.nextInt();

            if(c=='Y' && n >=37){
                num = 1;
            }
            else if (c =='N' && n>=37){
                num = 2;
            }
            else if(c=='Y' && n<37){
                num = 3;
            }
            else{
                num = 4;
            }

            arr[num] ++;
        }

        for(int i = 1; i<=4; i++){
            System.out.print(arr[i]+" ");
        }
        if (arr[1]>=2){
            System.out.print('E');
        }

    }
}