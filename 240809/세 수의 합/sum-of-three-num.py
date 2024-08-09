from itertools import combinations 
n, k = map(int,input().split())
count = 0
num = list(map(int,input().split()))
tal = []
cnt = 0  
def backtracking(cnt):
    global count
    if len(tal) == 3:
        if sum(tal) == k:
            count+=1
        return 
    
    for i in range(cnt,n):
        tal.append(num[i])
        backtracking(i+1)
        tal.pop()
backtracking(cnt)
print(count)