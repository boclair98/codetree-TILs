n, m = map(int,input().split())
num = list(map(int,input().split()))

tal = [] 
max_val = 0 
visited = [False] * n
def xor(tal):
    num = 0 
    for i in range(1,m):
        num=(tal[i-1] ^ tal[i])
    return num 

def back(s):
    global max_val
    if len(tal) == m:
        max_val = max(max_val,xor(tal))

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