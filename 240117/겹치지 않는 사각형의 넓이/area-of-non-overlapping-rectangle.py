num = [[0 for _ in range(2000)] for _ in range(2000)]
cnt = 0 
val = 1
for _ in range(3):
    a, b, c, d = map(int,input().split())

    a+=1000
    b+=1000
    c+=1000
    d+=1000

    for i in range(a,c):
        for j in range(b,d):
            num[i][j]=val
    val+=1

for i in range(2000):
    for j in range(2000):
        if num[i][j] < 3 and num[i][j] > 0:
            cnt+=1
print(cnt)