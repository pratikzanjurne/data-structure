package primeanagrams;

import com.bridgelabz.utility.Utility;

public class PrimeAnagrams 
{
 public static void main(String args[])
 {
	 int i,j;
	 Utility u=new Utility();
	 int primes[]=Utility.getprimeArray();
	 int AnaPrimes[]=new int[200];
	 int NotAPrimes[]=new int[300];
	 int allprimes2d[][]=new int[500][500];
	 int k=0,o=0;
	// System.out.println("Anagram numbers are :");
	 for(i=0;i<primes.length;i++)
	 {
		 String s=String.valueOf(primes[i]);
		 for(j=0;j<primes.length;j++)
		 {
			 String t=String.valueOf(primes[j]);			 
			 boolean result=u.chackAnageam(s, t);
			 if(result==true&&i!=j&&primes[i]!=0&&primes[j]!=0)
			 {
				// System.out.println(s+" "+t);
				 AnaPrimes[k]=primes[i];
				 k++;
			 }
		 }
	 }

	 int q=0;
	 int r=0;
	 int r1=0;
	 for(int w=0;w<primes.length;w++)
	 {
		 if(primes[w]!=AnaPrimes[q])
		 {
			 allprimes2d[r][0]=primes[w];
			 r++;
		 }
		 else
		 {
			 allprimes2d[r1][1]=primes[w];
			 q++;
			 r1++;
		 }
	 }
	 for(int l=0;l<r;l++)
	 {
		 for(int c=0;c<2;c++)
		 {
			 System.out.print(allprimes2d[l][c]+" ");
		 }
		 System.out.println(" ");
	 }
	 
//	 for(int l=0;l<AnaPrimes.length;l++)
//	{
//	    System.out.println(AnaPrimes[l]+" "+NotAPrimes[l]);
//	 }
	 
 }
}
