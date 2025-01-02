package com.arraymanipulation;

public class LeftRightSum {

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,0};
        int midIndex = arr.length/2;
        int end = arr.length;
        int ans = -1;

        for(int i=0;i<end;i++){
            int sum1=0;
            int sum2=0;
            if(i<midIndex){ // 0<2 , 1<2
                int temp = 
                sum1+=arr[i];// sum = 0+1 = 1
            }
            else if(i>midIndex){
              sum2+=arr[i];
            }

            if(sum1==sum2 && sum1!=0){
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
