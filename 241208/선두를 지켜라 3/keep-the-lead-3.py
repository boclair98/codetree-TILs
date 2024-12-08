n , m = map(int,input().split())
blocka = [0]*1000001
blockb = [0]*1000001
time_a = 1
time_b = 1
for _ in range(n):
    a,b = map(int,input().split())
    for i in range(b):
        blocka[time_a] = blocka[time_a - 1] + a
        time_a +=1
for _ in range(m):
    a,b = map(int,input().split())
    for i in range(b):
        blockb[time_b] = blockb[time_b - 1] + a
        time_b +=1
cnt = 0
leader = 0 
for i in range(1,time_b):
    if blocka[i] ==blockb[i]:
        cnt = cnt + 1
    elif blocka[i] > blockb[i]:
        if leader == 2:
            cnt = cnt + 1
        leader = 1
    elif blocka[i] < blockb[i]:
        if leader == 1:
            cnt = cnt + 1
        leader = 2
print(cnt)