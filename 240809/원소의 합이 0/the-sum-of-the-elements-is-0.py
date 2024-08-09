n = int(input())
num = [list(map(int,input().split())) for _ in range(4)]
dic = {}
dic2 = {}
cnt  = 0 
for i in range(n):
    for j in range(n):
        if num[0][i] + num[1][j] not in dic:
            dic[num[0][i] + num[1][j]] = 1
        else:
            dic[num[0][i] + num[1][j]]+=1 
        if num[2][i] + num[3][j] not in dic2:
            dic2[num[2][i] + num[3][j]] = 1
        else:
            dic2[num[2][i] + num[3][j]] +=1
        
count = 0 
for i in dic:
    dic[i]-=1 
    for j in dic2:
        if i + j == 0:
            count+=dic2[j]
print(count)