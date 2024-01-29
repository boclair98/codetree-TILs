import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 학생 수와 예산 입력
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        // 각 학생의 선물 가격 입력 및 정렬
        int[] gifts = new int[N];
        for (int i = 0; i < N; i++) {
            gifts[i] = sc.nextInt();
        }
        Arrays.sort(gifts);

        // 선물 가능한 학생의 최대 명수 계산
        int maxStudents = 0;
        int remainingBudget = B;

        for (int i = 0; i < N; i++) {
            if (remainingBudget >= gifts[i]) {
                remainingBudget -= gifts[i];
                maxStudents++;
            } else {
                // 쿠폰 사용
                remainingBudget += (gifts[i] / 2);
                
                // 쿠폰 사용 후 여전히 예산이 모자라면 더 이상 확인하지 않고 종료
                if (remainingBudget < gifts[i]) {
                    break;
                }
                
                maxStudents++;
            }
        }

        System.out.println(maxStudents);
    }
}