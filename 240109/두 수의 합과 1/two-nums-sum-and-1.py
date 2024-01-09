a,b = map(int,input().split())
tal = a+b
tal = str(tal)

cnt = 0 

for i in tal:
    if i =='1':
        cnt+=1
print(cnt)