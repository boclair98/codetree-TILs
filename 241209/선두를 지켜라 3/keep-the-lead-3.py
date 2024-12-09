n,m = map(int,input().split())
a = [0]*10001
idx = 1 
b = [0]*10001
idx2 = 1
for _ in range(n):
    v,t = map(int,input().split())
    for i in range(t):
        a[idx] = a[idx-1] + v
        idx+=1

for _ in range(m):
    v,t = map(int,input().split())
    for i in range(t):
        b[idx2] = b[idx2-1] + v
        idx2+=1

rank = []

for i in range(1,1001):
    if len(rank) == 0:
        if a[i] > b[i]:
            rank.append('a')
        elif a[i] < b[i]:
            rank.append('b')
        else:
            rank.append(('a','b'))
    elif len(rank) > 0:
        if (a[i] > b[i]):
            if rank[-1] =='b' or rank[-1] ==("a","b"):
                rank.append('a')
        elif a[i] < b[i]:
            if rank[-1] =='a' or rank[-1] ==("a","b"):
                rank.append('b')
        else:
            if(rank[-1] == 'a' or rank[-1]) =='b':
                rank.append(('a','b'))
print(len(rank))