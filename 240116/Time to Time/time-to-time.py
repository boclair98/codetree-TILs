a,b,c,d = map(int,input().split())
cnt = 0 
while True:
    if a==c and b==d:
        break
    cnt+=1
    b = b+1
    if b==60:
        a =a+1
        b= 0
print(cnt)