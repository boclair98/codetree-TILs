n,m = map(int,input().split())
arr = [[0]*m for _ in range(n)]
tal = 0

for i in range(m):
    if i%2 == 0:

        for k in range(n):
            arr[k][i] = tal
            tal+=1
    else:
        for t in range(n-1,-1,-1):
            arr[t][i] = tal
            tal+=1

for i in range(n):
    for j in range(m):
        print(arr[i][j],end=" ")
    print()