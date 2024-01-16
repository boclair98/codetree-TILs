n , k =map(int,input().split())


max_val = 0 
for _ in range(k):
    arr = [0] *(n+1)
    a,b = map(int,input().split())

    for i in range(a,b+1):
        arr[i] = 1
    
    if sum(arr) > max_val:
        max_val = sum(arr)

print(max_val)