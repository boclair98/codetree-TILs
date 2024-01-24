a,b,c,d = map(int,input().split())
a1,b1,c1,d1 = map(int,input().split())

square = [[0]*2001 for _ in range(2001)]
a+=500
b+=500
c+=500
d+=500

a1+=500
b1+=500
c1+=500
d1+=500
for i in range(a,c):
    for j in range(b,d):
        square[i][j] = 1

for i in range(a1,c1):
    for j in range(b1,d1):
        if square[i][j] == 1:
            square[i][j] =2
cnt = 0 
for i in range(a,c):
    for j in range(b,d):
        if square[i][j] == 1 or square[i][j] ==2:
            cnt+=1
print(cnt)