n = int(input())
arr = list(map(int,input().split())) 
max_val = 0 ;
for i in range(n-1):
    for j in range(i+1,n):
        if arr[i] < arr[j] and max_val<arr[j]-arr[i]:
            max_val = arr[j] - arr[i]
            break;

print(max_val)