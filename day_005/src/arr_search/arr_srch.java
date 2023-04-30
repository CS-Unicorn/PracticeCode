package arr_search;

import java.util.Scanner;

public class arr_srch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("查找一个数字:");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (data == arr[i]) {
                System.out.println(i);
                flag ++;
            }
        }
        if(flag == 0){
            System.out.println("查找失败");
        }
    }
}