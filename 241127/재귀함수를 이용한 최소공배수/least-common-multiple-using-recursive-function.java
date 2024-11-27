import java.util.Scanner;

public class Main {
    private static int n; // 배열 크기
    private static int[] arr; // 입력 배열
    private static int total; // 두 최댓값의 곱
    private static int max_val1, max_val2; // 첫 번째, 두 번째 최댓값

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 배열 크기 입력
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 배열 요소 입력
        }

        // 1. 첫 번째 최댓값 찾기
        for (int i = 0; i < n; i++) {
            if (arr[i] > max_val1) {
                max_val1 = arr[i];
            }
        }

        // 2. 두 번째 최댓값 찾기
        for (int i = 0; i < n; i++) {
            if (arr[i] < max_val1 && arr[i] > max_val2) {
                max_val2 = arr[i];
            }
        }

        // 3. 두 최댓값의 곱
        total = max_val1 * max_val2;

        // 4. 최소공배수 찾기
        System.out.println(findLcm(total));
    }

    // 배열의 모든 요소로 나누어떨어지는 최소공배수를 찾는 함수
    public static int findLcm(int number) {
        while (true) {
            boolean isLcm = true;

            for (int i = 0; i < arr.length; i++) {
                if (number % arr[i] != 0) {
                    isLcm = false;
                    break;
                }
            }

            if (isLcm) {
                return number; // 조건을 만족하면 반환
            }

            number += total; // total을 증가시키면서 확인
        }
    }
}