n = int(input())

arr = list(map(int,input().split()))
arr2 = list(map(int,input().split()))
arr.sort()
arr2.sort()

if arr == arr2:
    print("Yes")
else:
    print("No")