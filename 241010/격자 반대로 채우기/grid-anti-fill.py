n = int(input())
maps = [[0]*n for _ in range(n)]
cnt = 1
for i in range(n-1,-1,-1):
    if (n-i) % 2 == 1:
        for j in range(n-1,-1,-1):
            maps[j][i] = cnt 
            cnt+=1
    else:

        for j in range(n):
            maps[j][i] = cnt 
            cnt+=1

for i in range(n):
    for j in range(n):
        print(maps[i][j],end=' ')
    print()