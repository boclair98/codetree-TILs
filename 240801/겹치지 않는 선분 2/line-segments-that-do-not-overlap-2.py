n = int(input())
num = [] 
for _ in range(n):
    x,y = map(int,input().split())
    num.append((x,y))

cnt = 0
for i in range(n):
    sx,sy = num[i]
    for j in range(n):
        if i == j :
            continue 
        x1,y1 = num[j]

        if sx<x1 and y1<sy:
            cnt+=1
        if sx > x1 and sy < y1:
            cnt+=1
            
print(cnt)