import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[10];
        int value = 0 ;
        int value2 = 0 ; 
        for(int i = 0 ; i<10; i++){
            arr[i]= sc.nextInt();
            if(arr[i]>value && arr[i]<500){
                value = arr[i];
            }
        }

        for(int i = 0 ; i<10; i++){
            if(arr[i]>500){
                value2 = arr[i];
                break;
            }
        }

        for(int i = 0 ; i<10; i++){
            if(arr[i]>500 && arr[i]<value2){
                value2 = arr[i];
            }
        }
        System.out.print(value+" "+value2);
    }
}