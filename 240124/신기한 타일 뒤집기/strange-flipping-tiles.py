n = int(input())

color = ["False"]*2001

time = [0] * 2001

right ,left,now =0,0,1000

for _ in range(n):
    tal = input().split()

    if tal[1] =='R':

        right = now + int(tal[0])

        

        for i in range(now,right):
            color[i] = 'Black'
        
        now = right 

    
    if tal[1] =='L':

        left = now - int(tal[0])

        for i in range(left,now):
            color[i] = 'White'

        now = left
wh,bl=0,0
for i in range(2001):
    if color[i]=='White':
        wh+=1
    elif color[i]=='Black':
        bl+=1
print(wh,bl)