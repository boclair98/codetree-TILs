n = int(input())
arr = [[0] * n for _ in range(n)]
cnt = n*n
if n%2 == 0:
    for i in range(n):

        if i%2==0:
            for j in range(n-1,-1,-1):
                arr[j][i] = cnt
                cnt-=1
        else:
            for k in range(n):
                arr[k][i] = cnt
                cnt-=1
else:
    for i in range(n):

        if i%2==1:
            for j in range(n-1,-1,-1):
                arr[j][i] = cnt
                cnt-=1
        else:
            for k in range(n):
                arr[k][i] = cnt
                cnt-=1
                
for i in range(n):
    for j in range(n):
        print(arr[i][j],end=" ")
    print()