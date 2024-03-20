n = int(input())
total_sum = n*(n+1)//2
if(total_sum%2==1):
    print("NO")
else:
    vis = [0]*(n+1)
    set1_sum = 0
    max_element = n
    set1_len=0
    while(set1_sum<total_sum//2):
        remaining_sum = total_sum//2 - set1_sum
        if(remaining_sum>max_element):
            vis[max_element]=1
            set1_sum+=max_element
            max_element-=1
            set1_len+=1
        else:
            vis[remaining_sum]=1
            set1_sum=total_sum//2
            set1_len+=1
    print("YES")
    print(set1_len)
    for i in range(1,n+1):
        if(vis[i]==1):
            print(i, end=" ")
    print()
    print(n-set1_len)
    for i in range(1,n+1):
        if(vis[i]==0):
            print(i, end=" ")
    
