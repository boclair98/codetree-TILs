a,b,c,d = map(int,input().split())
a1,b1,c1,d1 = map(int,input().split())
tal = (c-a) * (d-b)
square = [[0]*2001 for _ in range(2001)]
a+=1000
b+=1000
c+=1000
d+=1000

a1+=1000
b1+=1000
c1+=1000
d1+=1000
for i in range(a,c):
    for j in range(b,d):
        square[i][j] = 1

for j in range(a1,c1):
    for i in range(b1,d1):
        square[j][i] = 2

min_x ,max_x ,min_y , max_y = 20001,0,20001,0
exist = False

for i in range(2001):
    for j in range(2001):

        if square[i][j] == 1:
            exist = True

            min_x = min(min_x,i)
            max_x = max(max_x,i)
            min_y = min(min_y,j)
            max_y = max(max_y,j)

if exist:
    area = (max_x-min_x+1) * (max_y - min_y+1)
else:
    area = 0
print(area)