package com.example.demo;

public class double23
{
    public boolean double23(int[] nums)
    {
        if (nums.length < 2)
        {
            return false;
        }

        int twoCount = 0;
        int threeCount = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 2)
            {
                twoCount++;
            }
            if (nums[i] == 3)
            {
                threeCount++;
            }
        }
        return threeCount >= 2 || twoCount >= 2;
    }
}
