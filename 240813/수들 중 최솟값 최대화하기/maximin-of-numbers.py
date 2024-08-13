n = int(input())
num = [list(map(int,input().split())) for _ in range(n)]

tal = []
visited = [False] * n  
total = [] 
def back(depth):
    if len(tal) == n :
        total.append(min(tal))
        return 
    
    for i in range(n):
        if visited[i] == False:
            visited[i] = True
            tal.append(num[depth][i]) 
            back(depth+1)
            visited[i] = False
            tal.pop()
back(0)
print(max(total))