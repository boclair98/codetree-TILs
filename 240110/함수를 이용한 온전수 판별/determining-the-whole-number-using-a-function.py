a,b = map(int,input().split())

def onsu(i):
    if i%2 == 0:
        return True
    elif i%10 == 5:
        return True
    elif i%3==0 and i%9!=0:
        return True
    else:
        return False

cnt = 0 
for i in range(a,b+1):
    if not onsu(i):
        cnt+=1
print(cnt)