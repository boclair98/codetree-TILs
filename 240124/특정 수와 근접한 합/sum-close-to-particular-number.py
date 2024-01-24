from itertools import combinations

s,n = map(int,input().split())
num = list(map(int,input().split()))

list1 = []
for i in combinations(num,s-2):
    tal = sum(i)
    list1.append(tal)

min_value = 1000000

for i in range(len(list1)):
    val = list1[i] - n 

    if val>=0:
        min_value = min(val,min_value)
        
print(min_value)