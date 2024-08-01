n = int(input())
num = [] 
for _ in range(n):
    x,y = map(int,input().split())
    num.append((x,y))
cnt = n

for i in range(n):
    x,y = num[i]
    flag = True 
    for j in range(n):
        if i == j :
            continue 
        x1,y1 = num[j]
        if x1<x<y<y1:
            cnt-=2
print(cnt)