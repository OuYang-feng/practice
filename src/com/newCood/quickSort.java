package com.newCood;

public class quickSort {
    public static void main(String[] args) {
//        int[] a = {2,5,3,1,6,8,7};
//        System.out.println(Arrays.toString(new quickSort().sort(a,0,6)));
        int[] input = new int[] { 12, 1, 50, 8, 9, 8, 6, 7, 10, 3 };
        main(input,0,9);
        for(int i : input){
            System.out.print(i+" ");
        }

    }
    public static int[] main(int[] a, int l, int r){

            if (l < r)
            {
                //Swap(s[l], s[(l + r) / 2]); //���м��������͵�һ�������� �μ�ע1
                int i = l, j = r, x = a[l];
                while (i < j)
                {
                    while(i < j && a[j] >= x) // ���������ҵ�һ��С��x����
                        j--;
                    if(i < j)
                        a[i++] = a[j];

                    while(i < j && a[i] < x) // ���������ҵ�һ�����ڵ���x����
                        i++;
                    if(i < j)
                        a[j--] = a[i];
                }
                a[i] = x;
                main(a, l, i - 1); // �ݹ����
                main(a, i + 1, r);
            }

        return a;
    }

}
