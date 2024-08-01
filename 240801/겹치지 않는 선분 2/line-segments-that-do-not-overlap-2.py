n = int(input())
num = [] 
for _ in range(n):
    x,y = map(int,input().split())
    num.append((x,y))
cnt = set()
cnt2 = [] 
for i in range(n):
    sx,sy = num[i]
    for j in range(n):
        if i == j :
            continue 
        x1,y1 = num[j]
        if x1<sx<=y1 and x1<sy<=y1:
            cnt.add((sx,sy))
            cnt.add((x1,y1))
        if y1<sx<=x1 and y1<sy<=x1:
            cnt.add((sx,sy))
            cnt.add((x1,y1))
print(len(num)-  len(cnt))