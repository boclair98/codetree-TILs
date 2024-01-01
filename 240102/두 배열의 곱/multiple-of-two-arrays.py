arr = []
arr2 = []

for _ in range(3):
    arr.append(list(map(int,input().split())))
input()
for _ in range(3):
    arr2.append(list(map(int,input().split())))

tot_arr = [[0]*3 for _ in range(3)]

for i in range(3):
    for j in range(3):
        tot_arr[i][j] = arr[i][j] * arr2[i][j]
        print(tot_arr[i][j],end=" ")
    print()