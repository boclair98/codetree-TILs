n = int(input())

visited = [0] *(10000)
color = ['Yellow'] *(10000)
now = 100 
for _ in range(n):
    s,r = input().split() 
    s = int(s)
    
    if r =='L':
        for i in range(now,now-s,-1):
            if color[i] =='Yellow':   
                visited[i]+=1
                color[i] = 'White'
            elif color[i] =='Black':
                color[i] = 'White'
                visited[i]+=2
            else:
                color[i]='White'
                visited[i]+=2
        now = now - s+1 
    elif r == 'R':
        for i in range(now,now+s):
            if color[i] =='Yellow':   
                visited[i]+=1
                color[i] = 'Black'
            elif color[i] =='White':
                color[i] = 'Black'
                visited[i]+=2
            else:
                color[i]='Black'
                visited[i]+=2
        now=now+s-1
    
gray,white,black = 0,0,0
for i in range(10000):
    if visited[i] >= 5:
        gray+=1
    elif visited[i]>=1:
        if color[i]=='White':
            white+=1
        else:
            black+=1

print(white,black,gray)