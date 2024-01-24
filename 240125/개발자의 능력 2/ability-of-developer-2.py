import sys
arr = list(map(int,input().split()))
n = len(arr)
min_diff = sys.maxsize
def diff(a,b,c,d):

    sum1 = arr[a] + arr[b]
    sum2 = arr[c] + arr[d]
    sum3 = sum(arr) - sum1 - sum2

    tal = abs(sum1 - sum2)
    tal = max(tal,abs(sum2 - sum3))
    tal = max(tal,abs(sum3 - sum1))

    return tal


for i in range(n):
    for j in range(i+1,n):

        for t in range(n):
            for k in range(t+1,n):
                if i == t or i==k or j == t or j == k:
                    continue

                min_diff = min(min_diff,diff(i,j,t,k))

print(min_diff)