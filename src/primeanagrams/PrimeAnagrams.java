package primeanagrams;

import com.bridgelabz.utility.Utility;

public class PrimeAnagrams 
{
 public static void main(String args[])
 {
	 Utility u=new Utility();
	 int primes[]=Utility.getprimeArray();
	 int AnaPrimes[]=new int[200];
	 int NotAPrimes[]=new int[300];
	 int k=0;
	 for(int i=0;i<primes.length;i++)
	 {
		 for(int j=0;j<primes.length;j++)
		 {
			 String s=String.valueOf(primes[i]);

			 String t=String.valueOf(primes[i+1]);
			 System.out.println(t);			 
			 boolean result=u.chackAnageam(s, t);
			 if(result==true)
			 {
				 AnaPrimes[k]=primes[i];
				 AnaPrimes[k+1]=primes[j+1];
				 k++;
			 }
			 else
			 {
				 
			 }
		 }
	 }
	 System.out.println(AnaPrimes);
 }
}
