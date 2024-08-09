from itertools import combinations 
n, k = map(int,input().split())
count = 0
num = list(map(int,input().split()))
for i in combinations(num,3):
    if sum(i) == k:
        count+=1
print(count)