from functools import reduce
n, m = map(int,input().split())
num = list(map(int,input().split()))

tal = [] 
max_val = 0 
visited = [False] * n


def back(s):
    global max_val
    if len(tal) == m:
        result = reduce(lambda x, y: x ^ y, tal)
        max_val = max(max_val,result)

        return
    
    for i in range(s,n):
        if visited[i] == False:
            visited[i] = True
            tal.append(num[i])
            back(i+1)
            visited[i] = False
            tal.pop()
back(0)
print(max_val)