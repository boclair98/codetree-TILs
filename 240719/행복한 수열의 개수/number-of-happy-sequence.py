n, m = map(int,input().split())
num = [list(map(int,input().split())) for _ in range(n)]
total = 0

for i in range(n):
    cnt = 1
    first = num[i][0] 
    for j in range(1,n):
        if cnt >= m:
            break 
        if first != num[i][j]:
            first = num[i][j]
            cnt = 1 
        else:
            cnt+=1
    if cnt >=m:
        total+=1

for i in range(n):
    cnt1 = 1 
    two = num[0][i]
    for j in range(1,n):
        if cnt1 >= m:
            break
        if two != num[j][i]:
            two = num[j][i]
            cnt1 = 1
        else:
            cnt1+=1
    if cnt1>=m:
        total+=1
print(total)