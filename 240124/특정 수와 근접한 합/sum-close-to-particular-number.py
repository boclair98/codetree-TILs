from itertools import combinations

s,n = map(int,input().split())
num = list(map(int,input().split()))

list1 = []
for i in combinations(num,s-2):
    tal = sum(i)
    list1.append(tal)

for i in range(len(list1)):
    list1[i] = list1[i] - n
list1.sort()

for j in range(len(list1)):
    if list1[j] >0:
        print(list1[j])
        break