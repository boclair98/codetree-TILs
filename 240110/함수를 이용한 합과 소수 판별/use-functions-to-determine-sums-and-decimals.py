a,b = map(int,input().split())

def sosu(i):
    for  k in range(2,i):
        if i% k == 0:
            return False
    return True

cnt = 0 
for i in range(a,b+1):
    if sosu(i):
        if ((i//10) + (i%10) ) %2 == 0:
            cnt+=1
print(cnt)