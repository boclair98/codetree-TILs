n = int(input())
dic = {}
name = set()
for _ in range(n):
    na = input()
    if na not in dic:
        dic[na] = 1
    else:
        dic[na]+=1
tal = []
for i in dic:
    tal.append(dic[i])
print(max(tal))