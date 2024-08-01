n, m = map(int,input().split())
num = list(map(int,input().split()))
dic = {}
x,y = map(int,input().split())

for i in range(n):
    if num[i] not in dic:
        dic[num[i]] = 1
    else:
        dic[num[i]]+=1

if x in dic:
    print(dic[x],end=' ')
else:
    print(0,end=' ')
if y in dic:
    print(dic[y],end=' ')
else:
    print(0,end=' ')