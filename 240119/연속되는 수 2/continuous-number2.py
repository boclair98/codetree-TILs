n = int(input())
num = []
for _ in range(n):
    num.append(int(input()))

cnt = 0 
tal = 0 
for i in range(n-1):

    if num[i] == num[i+1]:
        cnt+=1
    
    else:
        cnt = 1
    
    tal = max(tal,cnt)
print(tal)