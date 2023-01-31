public class sumre {
    public static void main(String args[])
    {
        int n=5,i=1,sum=0;
        calsum(i,n,sum);
       
    }
    public static void calsum(int i,int num,int sum)
    {
             if(i==num)
             {
                    sum+=i;
                    System.out.println(sum);
                    return;
             }
              sum+=i;
              calsum(i+1, num, sum);
              System.out.println(i);

    }
}

