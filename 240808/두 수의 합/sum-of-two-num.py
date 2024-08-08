n, k = map(int,input().split())
num = [list(map(int,input().split()))]

p_t = {}
cnt = 1
for i in range(n):
    for j in range(n):
        if i == j:
            continue 
        if p_t not in cnt:
            pt[cnt] = num[i] + num[j]
print(pt)