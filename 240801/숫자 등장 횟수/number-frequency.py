n, m = map(int,input().split())
num = list(map(int,input().split()))
dic = {}
mm = list(map(int,input().split()))

for i in range(n):
    if num[i] not in dic:
        dic[num[i]] = 1
    else:
        dic[num[i]]+=1

for i in range(m):
    if mm[i] in dic:
        print(dic[mm[i]],end=' ')
    else:
        print(0,end=' ')