n = int(input())
num = [] 
for _ in range(n):
    x,y = map(int,input().split())
    num.append((x,y))
cnt = n

for i in range(n):
    x,y = num[i]
    for j in range(n):
        if i == j :
            continue 
        x1,y1 = num[j]
        if x1<y<y1 and x1<x<y1:
            cnt-=2
        elif x1>y>y1 and x1>x>y1:
            cnt-=2
print(cnt)