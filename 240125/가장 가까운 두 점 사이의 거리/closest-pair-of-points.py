import sys
n = int(input())
INTMAX= sys.maxsize
num = [tuple(map(int,input().split())) for _ in range(n)]
ans = INTMAX
for i in range(n):
    min_x,max_x =INTMAX,0
    min_y,max_y = INTMAX,0

    for j,(x,y) in enumerate(num):

        if i == j :
            continue

        min_x = min(x,min_x)
        max_x = max(x,max_x)
        min_y = min(y,min_y)
        max_y = max(y,max_y)

    ans = min(ans,((max_x - min_x) *(max_x - min_x) + (max_y -min_y)*(max_y-min_y)) )

print(ans)