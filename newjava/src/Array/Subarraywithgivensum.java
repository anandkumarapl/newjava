package Array;

import java.util.ArrayList;

public class Subarraywithgivensum {

      static ArrayList<Integer> subarraySum(int[] a, int n, int s) 
    {
        ArrayList<Integer> result=new ArrayList<Integer>();
        int i=0;
     int   start=0;
     int  total=0;
       while (i<=n-1)

       {

           total+=a[i];

           

           if (total==s)

           {

               result.add(start + 1);

               result.add(i + 1);

               return result;

               

           }

           while (total>s)

           {

               total-=a[start];

               start+=1;

           }

           if (total==s)

               if (start<=i)

               {

                result.add(start + 1);

               result.add(i + 1);

               return result;

               }

            

           i+=1;

       }

           

           result.add(-1);

       return result;

    }
      public static void main(String args[]){
      }
}