n = int(input())

visited = [0] *(400)
color = ['Yellow'] *(400)
now = 100 
for _ in range(n):
    s,r = input().split() 
    s = int(s)
    
    if r =='L':
        for i in range(now,now-s,-1):
            visited[i]+=1
            color[i] = 'White'
        now = now - s +1
    elif r == 'R':
        for i in range(now,now+s):
            visited[i]+=1
            color[i] = 'Black'
        now=now+s-1

for i in range(400):
    if visited[i] >=4:
        color[i] ='gray'

white = color.count('White')
gray = color.count('gray')
Black = color.count("Black")
print(white,Black,gray)