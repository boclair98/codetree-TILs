n = int(input())
num =[[0 for _ in range(200)] for _ in range(200)] 

cnt = 0 

for _ in range(n):
    a, b, c, d = map(int,input().split())
    a+=100
    b+=100
    c+=100
    d+=100

    for i in range(a,c):
        for j in range(b,d):
            num[i][j]+=1
    
    for i in range(a,c):
        for j in range(b,d):
            if num[i][j]==1:
                cnt+=1
    
print(cnt)