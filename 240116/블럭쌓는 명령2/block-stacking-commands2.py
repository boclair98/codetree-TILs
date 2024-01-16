n , k =map(int,input().split())


max_val = 0 
arr = [0] *(n+1)
for _ in range(k):
    
    a,b = map(int,input().split())

    for i in range(a,b+1):
        arr[i] += 1
    
    max_num = max(arr)

print(max_num)