n,m = map(int,input().split())
a = [0]*10001
idx = 0 
b = [0]*10001
idx2 = 0
for _ in range(n):
    v,t = map(int,input().split())
    for i in range(idx+1,t+idx+1):
        a[i] = a[i-1]+ v
        idx+=1


for _ in range(m):
    v,t = map(int,input().split())
    for i in range(idx2+1,t+idx2+1):
        b[i] = b[i-1]+ v
        idx2+=1

rank = [] 
for i in range(1,1001):
    if a[i] > b[i]:
        if len(rank) == 0:
            rank.append('a')
        elif rank[-1] !='a':
            rank.append('a')
        
    elif b[i] > a[i]:
        if len(rank) == 0:
            rank.append("b");
        elif rank[-1] !='b':
            rank.append('b')
        
    elif b[i] == a[i] and a[i] >0:
        if len(rank) == 0:   
            rank.append(("a","b"))
        elif rank[-1] != ("a","b"):
            rank.append(("a","b"))
    elif b[i] == 0 and a[i] == 0:
        break
print(len(rank))