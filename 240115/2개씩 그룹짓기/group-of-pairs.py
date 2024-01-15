n = int(input())
arr = list(map(int,input().split()))
arr.sort()
tal = 0 
for i in range(1,n+1):
    tal = tal + arr[-i]

max_val = 0 
num = n*2
for i in range(0,num - n):
    
    if sum(arr[i:i+n]) < tal and sum(arr[i:i+n])>max_val :
        max_val = sum(arr[i:i+n])
print(max_val)