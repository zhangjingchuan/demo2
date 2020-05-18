package com.example.demo2;


public class BubbleTest {

    public static void main(String[] args) {
        int [] nums = new int[]{2,3,4,1,6,8,3,10};
        bubble(nums);
    }

    /**
     * 冒泡排序
     * @param nums
     */
    private static void bubble(int [] nums){
        //验证数据是否为空
        if(nums==null){
            System.out.println("数组为空");
            return ;
        }

        //获取数组长度
        int length = nums.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        //输出结果
        for(int num : nums){
            System.out.println(num);
        }
    }

}
