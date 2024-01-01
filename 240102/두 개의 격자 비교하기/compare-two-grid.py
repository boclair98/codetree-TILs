n , m = map(int,input().split())
arr = []
arr2 = []
for _ in range(n):
    arr.append(list(map(int,input().split())))

for _ in range(n):
    arr2.append(list(map(int,input().split())))
arr3 = [[0]*m for _ in range(n)]
for i in range(n):
    for j in range(m):
        if arr[i][j] == arr2[i][j]:
            arr3[i][j] = 0
        else:
            arr3[i][j] = 1

for i in range(n):
    for j in range(m):
        print(arr3[i][j],end=" ")
    print()