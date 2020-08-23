/* package codechef; // don't place package name! */
/* Problem Link: https://www.codechef.com/AUG20B/problems/CHEFWED */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFWED
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    for(int z=0; z<t; z++){
		        long n = sc.nextLong();
		        long k = sc.nextLong();
		        HashMap<Long, Long> map1 = new HashMap<>();
				long tables = 1;
				long overallConflictingGuests = 0;
				long conflictingGuests = 0;
				long count = 0;
		        boolean flag = true;
		        for(long i=0; i<n; i++){
		            long no = sc.nextLong();
		            if(!map1.containsKey(no)){
		                map1.put(no,(long)1);
		            }else{
		                long freq = map1.get(no)+1;
		                if(freq==2) conflictingGuests+=2;
		                else conflictingGuests++;
		                
		                if(conflictingGuests+(k*tables)>=k*(tables+1)){
							if(freq==2) conflictingGuests-=2;
		                	else conflictingGuests--;
							overallConflictingGuests += conflictingGuests;
							conflictingGuests = 0;
							tables++;
	                        map1 = new HashMap<>();
	                        map1.put(no,(long)1);
		                }else{
							map1.put(no,freq);
		                }
		            }
				}
				overallConflictingGuests += conflictingGuests;
		        System.out.println(overallConflictingGuests + (k*tables));
		    }
		}catch(Exception e){
		    return;
		}
	}
}
