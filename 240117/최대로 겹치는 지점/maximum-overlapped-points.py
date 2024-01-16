n = int(input())

arr = [0]*101

max_val = 0

for _ in range(n):

    a,b= map(int,input().split())

    for i in range(a,b+1):
        arr[i]+=1
    
    for j in range(101):
        if arr[j]>max_val:
            max_val = arr[j]
print(max_val)