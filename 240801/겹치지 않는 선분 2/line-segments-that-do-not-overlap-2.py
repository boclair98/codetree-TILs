n = int(input())
num = [] 
for _ in range(n):
    x,y = map(int,input().split())
    num.append((x,y))

cnt = []
for i in range(n):
    sx,sy = num[i]
    for j in range(n):
        if i == j :
            continue 
        x1,y1 = num[j]
        if x1<sx<y1 and x1<sy<y1:
            cnt.append((sx,sy,x1,y1))
        
        
            
print(cnt)