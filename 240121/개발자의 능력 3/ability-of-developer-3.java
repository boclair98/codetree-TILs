import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] tal = new int[6];
        int value = 0 ;
        for(int i =0; i<6; i++){
            tal[i] = sc.nextInt();
            value+=tal[i];
        }
        
        int min_value = 1000000;

        for(int i = 0 ; i<6; i++){

            for(int j = i+1 ; j<6; j++){

                for(int k = j+1; k<6; k++){
                    int num = tal[i]+tal[j]+tal[k] ;
                    int score = value - num;
                    

                    min_value = Math.min(min_value,Math.abs(num-score)); 
                    
                }
            }
        }
        System.out.print(min_value);
        
    }
}