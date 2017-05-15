public class ChangePosition
{
	public int[] exchange(int[] unsorted)
	{
		int left=0,right=unsorted.length-1;
		while(left<right)
		{
			//分以下四种情况讨论，1.两边都需要换位置  2.仅左边 3.仅右边 4.两边都不需要
			if(unsorted[left]%2==0&&unsorted[right]%2!=0)
			{
				int temp=unsorted[right];
				unsorted[right]=unsorted[left];
				unsorted[left]=temp;
				left++;
				right--;
			}else if(unsorted[left]%2==0&&unsorted[right]%2==0)
			{
				right--;
			}else if(unsorted[left]%2!=0&&unsorted[right]%2!=0)
			{
				left++;
			}else
			{
				left++;
				right--;
			}
		}
		return unsorted;
	}
	
	public static void main(String[] args)
	{
		int[] unsorted={1,2,3,2,11,23,32};
		int[] res=new ChangePosition().exchange(unsorted);
		for(int each:res)
		{
			System.out.print(each+",");
		}
	}
	
}