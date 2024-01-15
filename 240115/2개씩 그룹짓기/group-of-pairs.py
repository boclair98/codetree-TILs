n = int(input())

arr = list(map(int,input().split()))

arr.sort()

max_val = 0 

for i in range(n):
    if arr[i] + arr[2*n-1-i] > max_val:
        max_val = arr[i] + arr[2*n-1-i] 

print(max_val)