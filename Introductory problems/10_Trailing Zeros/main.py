n = int(input())
ans=0
cur = 5
while(cur<=n):
    ans+=n//cur 
    cur*=5
print(ans)
