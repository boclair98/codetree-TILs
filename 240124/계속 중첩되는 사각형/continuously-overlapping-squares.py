n = int(input())

squaer =[[0]*201 for _ in range(201)]
for i in range(1,n+1):
    number = i 
    x1,y1,x2,y2 = map(int,input().split())
    x1+=100
    y1+=100
    x2+=100
    y2+=100

    for j in range(x1,x2):
        for k in range(y1,y2):
            squaer[j][k] = i

cnt = 0 

for i in range(201):
    for j in range(201):
        if squaer[i][j] % 2 == 0 and squaer[i][j]!=0:
            cnt+=1
print(cnt)