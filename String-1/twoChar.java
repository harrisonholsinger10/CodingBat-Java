package com.example.demo;

public class twoChar
{
    public String twoChar(String str, int index)
    {
        if (str.length() < (index + 2) || str.length() < 2 || index < 0)
            return str.substring(0,2);

        return str.substring(index, index + 2);
    }
}