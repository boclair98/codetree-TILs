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
        
        square[i][j] = 2
        
cnt1 = 0
cnt2 = 0 
for i in range(a,c):
    for j in range(b,d):
        if square[i][j] == 1:
            cnt1+=1
        elif square[i][j] ==2:
            cnt2+=1
if cnt1 ==0:
    print(0)
else:
    print(cnt1)