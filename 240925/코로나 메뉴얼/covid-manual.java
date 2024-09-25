import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char fir_state = sc.next().charAt(0);
        int state1 = sc.nextInt();

        char sec_state = sc.next().charAt(0);
        int state2 = sc.nextInt();

        char thr_state = sc.next().charAt(0);
        int state3 = sc.nextInt();

        int total = 0 ;

        if (fir_state=='Y' && state1>=37 ){
            total+=1;
        }

        if (sec_state=='Y' && state2>=37 ){
            total+=1;
        }

        if (thr_state=='Y' && state3>=37 ){
            total+=1;
        }
        if(total>=2){
            System.out.print('E');
        }else{
            System.out.print('N');
        }
        
    }       
}