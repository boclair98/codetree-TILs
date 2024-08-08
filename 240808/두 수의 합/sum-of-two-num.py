n, k = map(int,input().split())
num = list(map(int,input().split()))

p_t = {}
cnt = 1
for i in range(n):
    for j in range(i+1,n):
        if i == j:
            continue
        p_t[cnt] = num[i] + num[j]
        cnt+=1
idx = 1 
count = 0
while idx < cnt :
    if p_t[idx] == k:
        count+=1
    idx+=1
print(count)