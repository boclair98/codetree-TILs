n,k = map(int,input().split())
coin = [int(input()) for _ in range(n)]
cnt = 0 
coin.sort(reverse = True)

for i in range(n):
    cnt+=(k//coin[i])
    k = k % coin[i]
    if k == 0:
        break 
print(cnt)