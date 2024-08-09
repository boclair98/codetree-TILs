from itertools import combinations 
n, k = map(int,input().split())
count = 0
num = list(map(int,input().split()))
dic ={}
for i in num:
    if i in dic:
        dic[i]+=1
    else:
        dic[i] = 1

for i in range(n):
    dic[num[i]] -=1 
    for j in range(i):
        diff = k - num[i] - num[j]
        if diff in dic:
            count+=dic[diff]
print(count)