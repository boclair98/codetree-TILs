arr = list(map(int,input().split()))

n = 1000
m = 0 

for i in range(len(arr)):
    if(arr[i]<500 and arr[i]>m):
        m = arr[i]

for i in range(len(arr)):
    if(arr[i]>500 and arr[i]<n):
        n = arr[i]
print(m,end=' ')
print(n)