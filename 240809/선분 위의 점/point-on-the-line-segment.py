n, m = map(int,input().split())
num = list(map(int,input().split()))
val = [0] * 100000000
for i in num:
    val[i]+=1

for _ in range(m):
    s,y = map(int,input().split())
    cnt = 0 
    for i in range(s,y+1):
        if val[i] == 1:
            cnt+=1
    print(cnt)