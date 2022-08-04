/*Creating a moviethreatre class in which there will be details of movienames , moviestarting time, movies ending time,price of ticket and print the data
by shikha */
class target
{
    
    public static void target1(int[] nums, int target)//declaration
    {
        for (int i = 0; i<nums.length-1; i++)
        {
            for (int j = i+1; j<nums.length; j++)
            {
                if (nums[i]+nums[j] == target)
                {
                    System.out.println("result("+nums[i]+","+nums[j]+")");
                    return;
                }
            }
        }

        System.out.println("resulted value is");
    }

    public static void target2(int[] N, int T)//declaration
    {
        for(int i=0; i<N.length-1; i++)
        {
            for(int j=i+1; j<N.length;j++)
            {
                if(N[i]+N[j] == T)
                {
                    System.out.println("result("+N[i]+","+N[j]+")");
                    return;
                }
            }
        }
    }
 
    public static void main (String[] args)
    {
        int[] nums = {2,4,6,5,3};
        int target = 11;
        int[] N = {45,6,3,7,34,3};
        int T = 41;
        target1(nums, target);
        target2(N, T);
    }
}