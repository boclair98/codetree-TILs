n = int(input())

color  = [False] * 2001

num = [0] * 2001
right = 0 
left = 0 
cur  = 1000
for i in range(n):
    a , b = map(str,input().split())
    a = int(a)

    if b == 'R':

        right = cur + a
        left = cur
        cur = right
        for j in range(left,right):
            num[j]+=1
            color[j] = "Black"
    if b == 'L':
        right = right 
        left = right - a
        cur = left
        for j in range(left,right):
            num[j]+=1
            color[j] = "White"
    
wh = 0 
bl = 0

for i in range(2001):
    if num[i]>0 and color[i] == "White":
        wh+=1
    if num[i]>0 and color[i] == "Black":
        bl+=1
print(wh,bl)