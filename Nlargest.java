package com.dynamicplanning;

public class Nlargest
{
	
	public int max(int a,int b)
	{
		return a>b?a:b;
	}
	
	public int maxSubArray(int[] pData)throws Exception{  
       //输入控制  
       if(pData==null)  
         throw new Exception("input can not be null");  
       int n=pData.length;  
       if(n==0)  
          throw new Exception("have no data,must have one element");  
       //只有一个数字的情况  
       if(n==1)  
          return pData[0];  
            
       //初始化   
       int[] f=new int[n]; //用数组f保存计算过程中的值  
       f[0]=pData[0];  
       int maxsofar=f[0];   //用maxsofar保留当前最大值  
       
       for(int i=1;i<n;i++){  
          if(f[i-1]<0)  
            f[i]=pData[i];  
          else  
            f[i]=f[i-1]+pData[i];  
          //记录最大值   
          maxsofar=max(maxsofar,f[i]);  
       }//end for  
         
       return maxsofar;  
    }//end maxSubArray()  
	
	public static void main(String[] args) throws Exception
	{
		int[] A={-1,2,3,4,45,-3,8,9,-100,90};
		int res=new Nlargest().maxSubArray(A);
		System.out.print(res);
	}
	
	
	
}