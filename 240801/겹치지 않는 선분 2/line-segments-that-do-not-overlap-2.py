n = int(input())
num = [] 
for _ in range(n):
    x,y = map(int,input().split())
    num.append((x,y))
cnt = 0

for i in range(n):
    sx,sy = num[i]
    flag =True 
    for j in range(n):
        if i == j :
            continue 
        x1,y1 = num[j]
        if (sx <=x1 and sy>=y1) or (sx>=x1 and sy<=y1):
            flag = False 
            break 
    if flag == False:
        cnt+=1
print(cnt)