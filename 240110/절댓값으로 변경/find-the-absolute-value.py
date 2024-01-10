n = int(input())
arr = list(map(int,input().split()))

def arr_abs(arr):
    for i in range(n):
        if arr[i]<0:
            arr[i] = - arr[i]
    return

arr_abs(arr)

for i in range(n):
    print(arr[i],end=' ')