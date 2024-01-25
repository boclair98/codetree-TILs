import sys
n = int(input())
INTMAX= sys.maxsize
num = [tuple(map(int,input().split())) for _ in range(n)]
ans = INTMAX
for i in range(n):
    tal1 = num[i][0]
    tal2 = num[i][1]
    

    for j ,(x,y) in enumerate(num):
        if i == j:
            continue
        
        ans = min(ans,(tal1 - x)**2 + (tal2 -x) **2)
print(ans)