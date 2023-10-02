package com.pidkui.geeks_for_geeks;

public class ScopeDemo2 {
	public static void main(String args[])
    {
        {
            int x = 5;
            {
//                int x = 10;
                System.out.println(x);
            }
        }
    }
}
