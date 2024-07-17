n = int(input())

visited = [0] *(10000)
color = ['Yellow'] *(10000)
now = 100 
for _ in range(n):
    s,r = input().split() 
    s = int(s)
    
    if r =='L':
        for i in range(now,now-s,-1):
            visited[i]+=1
            color[i] = 'White'
        now = now - s+1 
    elif r == 'R':
        for i in range(now,now+s):
            visited[i]+=1
            color[i] = 'Black'
        now=now+s-1
gray = 0
white = 0
black = 0
for i in range(10000):
    if visited[i] >=4:
        gray+=1
    elif visited[i]>=1:
        if color[i] =='Black':
            black+=1
        elif color[i]=='White':
            white+=1
print(white,black,gray)