n = int(input())
num = [list(map(int,input().split())) for _ in range(4)]
dic = {}
dic2 = {}
cnt  = 0 
for i in range(n):
    for j in range(n):
        dic[cnt] = num[0][i] + num[1][j]
        dic2[cnt] = num[2][i] + num[3][j]
        cnt+=1

tot = 0 
count = 0 

for i in dic:
    tal = dic[i]
    
    for j in dic2:
        if tal + dic2[j] == 0:
            count+=1
            
print(count)