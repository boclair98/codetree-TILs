n , m = map(int,input().split())
blocka = [0]*1000000
blockb = [0]*1000000
time_a=1
time_b=1
for i in range(n):
    a,b=map(str,input().split())
    b = int(b)
    if a =='R':
        for j in range(b):
            blocka[time_a] = blocka[time_a-1] + 1
            time_a+=1
    else:
        for j in range(b):
            blocka[time_a] = blocka[time_a-1]-1
            time_a+=1
for k in range(m):
    a,b=map(str,input().split())
    b = int(b)
    if a =='R':
        for j in range(b):
            blockb[time_b] = blockb[time_b-1] + 1
            time_b+=1
    else:
        for j in range(b):
            blockb[time_b] = blockb[time_b-1]-1
            time_b+=1
ans = -1
for i in range(1,time_a):
    if blocka[i] == blockb[i]:
        ans = i
        break
print(ans)