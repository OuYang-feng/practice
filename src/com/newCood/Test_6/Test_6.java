package com.newCood.Test_6;
import java.util.ArrayList;
import java.util.Scanner;

public class Test_6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(leastJumpTime(n, m));
        }
    }

        // ˼�룺dongtaiguihua
    public static int leastJumpTime(int n, int m) {
        if (m == n) {
            return 0;
        }
        int steps = m - n + 1;// �����������յ�
        int[] dp = new int[steps];// �滮���������� ÿ��λ����Ҫ����С����
        dp[0] = 0; // ���
        for (int i = 1; i < steps; i++) {
            dp[i] = Integer.MAX_VALUE; // ��ʼ�� ��ʾ����λ�ö����ܵ���
        }
    for (int i = 0; i < steps; i++) {
    // 0��Ӧnʯ�� ��steps - 1 = m-n��Ӧmʯ��
        if (dp[i] == Integer.MAX_VALUE) { // ��λ�ò�����ǰ��
            dp[i] = 0;
            continue;
        }
        ArrayList<Integer> list = getAppNums(i + n); // i+n����ʯ���
        for (int j = 0; j < list.size(); j++) {
            int x = list.get(j);
            if (i + n + x <= m) {
                dp[i + x] = Math.min(dp[i + x], dp[i] + 1);
            }
            }
    }
    if (dp[steps - 1] == 0) {
        return -1;
    } else {
        return dp[steps - 1];
    }
}

        // ������ ʱ�临�ӶȽϵ�
      public static ArrayList<Integer> getAppNums(int n) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    list.add(i);
                    if (n / i != i) {
                    list.add(n / i);
                    }
                }
            }
            return list;
      }
}

