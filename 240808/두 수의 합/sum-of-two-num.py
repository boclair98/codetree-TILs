n, k = map(int,input().split())
num = list(map(int,input().split()))

p_t = {}
cnt = 1
for i in range(n):
    for j in range(i+1,n):
        if num[i] + num[j] == k:
            cnt+=1
print(cnt-1)