import sys
n = int(input())
INTMAX = sys.maxsize

square = [tuple(map(int,input().split())) for _ in range(n)]

ans = INTMAX


for i in range(n):

    max_x ,min_x = 0,INTMAX
    max_y , min_y = 0, INTMAX

    for j,(x,y) in enumerate(square):
        if i == j :
            continue

        max_x = max(x,max_x)
        min_x = min(x,min_x)
        min_y = min(y,min_y)
        max_y = max(y,max_y)

    ans = min(ans, (max_x - min_x) * (max_y - min_y))
    

print(ans)