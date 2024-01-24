from itertools import combinations

s,n = map(int,input().split())
num = list(map(int,input().split()))

list1 = []
for i in combinations(num,s-2):
    tal = sum(i)
    list1.append(tal)

list1.sort()

for i in range(len(list1)):
    if list1[i]>= n :
        print(list1[i]-n)
        break