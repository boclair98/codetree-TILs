from collections import deque
# n명의 개발자들이 있으며 t번에 걸쳐 t초에 x개발자가 y개발자와 악수
n,k,p,t = map(int,input().split())
people = [0 for _ in range(n+1)]
virus = [k for _ in range(n+1)]
people[p] = 1
num = []
for _ in range(t):
    a,b,c = map(int,input().split())
    num.append([a,b,c])
num.sort(key = lambda x:x[0])
num = deque(num)

while num : 
    z,x,c = num.popleft()
    if people[x] == 1 and people[c] == 1:
        virus[x]-=1
        virus[c]-=1
    elif people[x] == 1 or people[c] == 1:
        if people[x] == 1 and virus[x] > 0:
            people[c] = 1
            virus[x]-=1
        elif people[c] == 1 and virus[c] > 0:
            people[x] = 1
            virus[c]-=1
    

    
for i in range(1,len(people)):
    print(people[i],end='')



