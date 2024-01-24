n = int(input())

color =["FALSE"]*2001

tile = [0] * 2001

right,left,now = 0 ,0 ,1000
for _ in range(n):
    toilet = input().split()

    if toilet[1] =='R':
        right = now + int(toilet[0])
        left = now
        now = right

        for i in range(left,right):
            tile[i]+=1
            color[i]='Black'

    elif toilet[1] =='L':
        right = now 
        left = now - int(toilet[0])
        now = left

        for i in range(left,right):
            tile[i]+=1
            color[i]='White'
wh = 0
bl = 0
gr = 0
for i in range(2001):
    if tile[i]>0 and tile[i]<4 and color[i]=='White':
        wh+=1 
    elif tile[i]>0 and tile[i]<4 and color[i]=='Black':
        bl+=1 
    elif tile[i]>3:
        gr+=1
print(wh,bl,gr)