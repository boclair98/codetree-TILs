n = int(input())

num = []

for _ in range(n):
    num.append(int(input()))
cnt = 0 
tal = 0
for i in range(n):

    if i>=1 and (num[i-1]<0 and num[i]<0):
        cnt +=1
    elif i>=1 and (num[i-1]>=0 and num[i]>=0):
        cnt+=1
    else:
        cnt = 1
    
    tal = max(cnt,tal)
print(tal)