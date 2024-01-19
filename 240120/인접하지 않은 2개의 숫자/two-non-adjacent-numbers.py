import sys
n = int(input())

num = list(map(int,input().split()))
min_val = -sys.maxsize
for i in range(n-2):

    for j in range(i+2,n):
        tal = num[i]+num[j]

        min_val = max(min_val,tal)

print(min_val)