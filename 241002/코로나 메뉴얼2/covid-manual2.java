import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for(int i = 0 ; i<3; i++){
            char x = sc.next().charAt(0);
            int n = sc.nextInt();
            if (x=='Y' && n>=37){
                arr[0]+=1;
            }else if(x=='N' && n>=37){
                arr[1]+=1;
            }else if(x=='Y' && n<37){
                arr[2]+=1;
            }else{
                arr[3]+=1;
            }
        }
        for(int i = 0 ; i<4; i++){
            System.out.print(arr[i]+" ");
        }
        if(arr[0]>=2){
            System.out.print('E');
        }
    }
}