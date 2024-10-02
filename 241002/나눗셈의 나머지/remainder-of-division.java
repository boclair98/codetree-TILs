import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[10];

        while (true){
            arr[a%b]+=1;
            a = a / b;
            if (a<=0){
                break;
            }
        }
        int total = 0 ;
        for(int i = 0 ;i<10; i++){
            total+=Math.pow(arr[i],2);
        }
        System.out.print(total);
    }
}