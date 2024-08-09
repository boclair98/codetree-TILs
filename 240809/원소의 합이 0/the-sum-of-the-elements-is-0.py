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
            dic[num[0][i] + num[1][j]] += 1 
count = 0 
for i in range(n):
    for j in range(n):
        diff = num[2][i] + num[3][j]
        if diff in dic:
            count+=dic[diff]
print(count)