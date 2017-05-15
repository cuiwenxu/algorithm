public class BinarySearch
{
	public int halfSearch(int[] list,int target)
	{
		int left=0,right=list.length-1;
		while(left<=right)
		{
			int mid=Integer.parseInt((right-left)/2);
			if(list[mid]==target)
			{
				return mid;
			}else if(list[mid]>target)
			{
				right=mid-1;
			}else
			{
				left=mid+1;
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		int[] list={1,2,3,4,5,1,2,4,5};
		int res=new BinarySearch().halfSearch(list,3);
		System.out.print("position="+res);
	}
	
}