n = int(input())
num = [] 
for _ in range(n):
    x,y = map(int,input().split())
    num.append((x,y))
cnt = 0 

for i in range(n):
    x,y = num[i]
    for j in range(n):
        if i == j :
            continue 
        x1,y1 = num[j]
        if y>x1 and y<y1:
            cnt+=1
print(cnt)