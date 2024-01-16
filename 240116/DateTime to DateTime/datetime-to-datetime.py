a,b,c = map(int,input().split())

a1,b1,c1 = 11,11,11
if a1>a :
    print(-1)
elif a1==a:
    if b1>b:
        print(-1)
else: 
    cnt = 0
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