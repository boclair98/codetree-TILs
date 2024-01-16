a,b,c = map(int,input().split())

a1,b1,c1 = 11,11,11
cnt = 0
if a1>a :
    print(-1)
else: 
    while True:
        if a1 == a and b1 ==b and c1 == c:
            break
        cnt+=1
        c1+=1
        if (c1==60):
            b1= b1+1
            c1 = 0
        
        if (b1 == 24):
            a1 = a1+1
            b1 = 0
        
print(cnt)