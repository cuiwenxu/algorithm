##此算法的优越性在于根据最后的和对元素进行有目的的遍历，而不是盲目的遍历，这样可以节省很多时间
def findTriplets(nums):
    res=[];
    ##为了降低时间复杂度，这里先对这些数字进行排序
    nums.sort()
    ##对i进行遍历，遍历的范围是1到倒数第二个位置
    for i in range(len(nums)-2):
        ##下面这一行代码是对元素i进行一个判重
        if i==0 or (i>0 and nums[i]==nums[i-1]):
            left=i+1
            right=len(nums)-1
            while left<right:
                s=nums[i]+nums[left]+nums[right]
                if s==0:
                    res.append([nums[i],nums[left],nums[right]])
                    left+=1
                    right-=1
                    while left<right and nums[left]==nums[left-1]:
                        left+=1
                    while right>left and nums[right]==nums[right+1]:
                        right-=1
                elif s<0:
                    left+=1
                else:
                    right-=1
    return res

nums=[-3,-1,0,-1,-1,2,3,4,-1,-3,-4,5,-5,5]
triples=findTriplets(nums)
for each in triples:
    print(each)

                    
