n = int(input())

color = ["no"] * 100001
num = [0]*100001

now,right,left = 50000,0,0

for _ in range(n):
    tal = input().split()

    if tal[1] =='R':
        right = now + int(tal[0])
        left = now
        now = right

        for i in range(left,right):
            num[i]+=1
            color[i] = "Black"
            
    
    elif tal[1] =='L':
        right = now
        left = now - int(tal[0])
        now = left

        for i in range(left,right):
            num[i]+=1
            color[i] ="White"
wh ,bl = 0 ,0
for i in range(100001):
    if num[i]>0 and color[i]=='White':
        wh+=1
    elif num[i]>0 and color[i]=='Black':
        bl +=1
print(wh,bl)