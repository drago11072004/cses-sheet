t =int(input())
for zz in range(t):
    x, y = map(int, input().split())
    ans=0
    if(y>=x):
        if(y%2==1):
            ans=y*y-x+1
        else:
            ans = (y-1)*(y-1)+x
    else:
        if(x%2==0):
            ans = x*x-y+1
        else:
            ans = (x-1)*(x-1)+y
    print (ans)