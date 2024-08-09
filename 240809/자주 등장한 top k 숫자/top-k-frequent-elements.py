n,k = map(int,input().split())
dic ={}
num = list(map(int,input().split()))

for i in num:
    if i in dic:
        dic[i]+=1
    else:
        dic[i] = 1
dic = sorted(dic.items(),key = lambda x :(x[1],x[0]),reverse = True)

for i in range(k):
    print(dic[i][0],end=' ')