import sys

INTMAX = sys.maxsize
n = int(input())
tri = [tuple(map(int,input().split())) for _ in range(n)]
ans = -INTMAX

for i in range(n):

    max_x,min_x=0,INTMAX
    max_y,min_y=0,INTMAX

    for j,(x,y) in enumerate(tri):

        if i == j :
            continue
        
        max_x = max(x, max_x)
        min_x = min(x, min_x)
        max_y = max(y, max_y)
        min_y = min(y, min_y)
    
    ans = max(ans, abs(max_x - min_x) * abs(max_y - min_y))

print(ans)