n = int(input())
arr = list(map(int,input().split()))
min_val = 1000000

for i in range(n):
    for j in range(i+1,n):
        val = arr[j] - arr[i]

        if val < min_val :
            min_val = val
print(min_val)