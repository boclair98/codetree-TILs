n = int(input())

a = [0] *(10000)
colorw = [0] *(10000)
colorb = [0] *(10000)
now = 100 
for _ in range(n):
    s,r = input().split() 
    s = int(s)
    
    if r =='L':
        for i in range(now,now-s,-1):
            colorw[i]+=1
            a[i] = 1
        now = now - s+1 
    elif r == 'R':
        for i in range(now,now+s):
            colorb[i]+=1
            a[i] = 2
        now=now+s-1
    
gray,white,black = 0,0,0
for i in range(10000):
    if colorb[i]>=2 and colorw[i]>=2:
        gray+=1
    elif a[i] == 1:
        white+=1
    elif a[i] == 2:
        black+=1
    

print(white,black,gray)