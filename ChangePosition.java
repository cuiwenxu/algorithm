public class ChangePosition
{
	public int[] exchange(int[] unsorted)
	{
		int left=0,right=unsorted.length-1;
		while(left<right)
		{
			//����������������ۣ�1.���߶���Ҫ��λ��  2.����� 3.���ұ� 4.���߶�����Ҫ
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