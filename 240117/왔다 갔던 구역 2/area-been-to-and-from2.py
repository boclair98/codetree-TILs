n = int(input())

num = [0] * 201
cur =  0 
cnt = 0 
for _ in range(n):
    x,r = map(str,input().split())
    x = int(x)
    

    if r =='R':
        right = cur + x
        left =cur
        cur =cur + x

        for i in range(left,right):
            num[i]+=1

    elif r == 'L':
        right = cur  
        left = cur - x
        cur = cur - x
        for j in range(right,left+1,-1):
            num[j]+=1

for i in range(0,201):
    if num[i] >= 2:
        cnt+=1
print(cnt)