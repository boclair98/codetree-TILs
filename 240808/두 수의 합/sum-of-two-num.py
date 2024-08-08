n, k = map(int,input().split())
num = list(map(int,input().split()))
pt = {}
count = 0 

for i in range(n):
    total = k - num[i]

    if total in pt:
        count+=pt[total]
    if num[i] in pt:
        pt[num[i]]+=1
    else:
        pt[num[i]] = 1
print(count)