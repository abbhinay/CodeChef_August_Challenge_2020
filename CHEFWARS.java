/* package codechef; // don't place package name! */
/* Problem Link: https://www.codechef.com/AUG20B/problems/CHEFWARS */ 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFWARS
{
	public static void main (String[] args) throws java.lang.Exception
	{   try{
    		Scanner sc = new Scanner(System.in);
    		long t = sc.nextLong();
    		for(long z=0; z<t; z++){
    		    long health = sc.nextLong();
    		    long power = sc.nextLong();
    		    while(health>0 && power>0){
    		        health = health-power;
    		        power = power/2;
    		    }
    		    if(health<=0){
    		        System.out.println(1);
    		    }else{
    		        System.out.println(0);
    		    }
    		}
	    }catch(Exception e){
	        return;
	    }
	}
}
