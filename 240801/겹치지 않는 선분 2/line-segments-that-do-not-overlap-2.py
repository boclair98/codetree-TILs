n = int(input())
num = [] 
for _ in range(n):
    x,y = map(int,input().split())
    num.append((x,y))
cnt = 0

for i in range(n):
    flag =True 
    for j in range(n):
        if i == j :
            continue 
        if (num[i][0] <=num[j][0] and num[i][1]>=num[j][1]) or (num[i][0]>=num[j][0] and num[i][1]<=num[j][1]):
            flag = False 
            break 
    if flag == False:
        cnt+=1
print(cnt)