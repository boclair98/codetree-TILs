from collections import deque 
from copy import deepcopy
n,k,m = map(int,input().split())
num = [list(map(int,input().split())) for _ in range(n)]

count = 0 
dx = [0,1,0,-1]
dy = [1,0,-1,0]
one = []
start= [] 
for i in range(k):
    a,b = map(int,input().split())
    a-=1
    b-=1
    start.append((a,b))



for i in range(n):
    for j in range(n):
        if num[i][j] == 1:
            one.append((i,j))

def bfs(num):
    visited = [[False]*n for _ in range(n)] 
    cnt = 1
    q = deque(start)
    visited[q[0][0]][q[0][1]] = True 
    while q:
        x,y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<n and 0<=ny<n :
                if visited[nx][ny] == False and num[nx][ny] == 0:
                    visited[nx][ny] = True 
                    q.append((nx,ny))
                    cnt+=1
    return cnt 

result = 0 
def dfs(count,idx):
    global result
    if count == m:
        graph = deepcopy(num)
        result = max(result,bfs(graph))
        return 
    
    if idx>= len(one):
        return 
    i,j = one[idx]
    num[i][j] = 0 
    dfs(count+1,idx+1)
    num[i][j] = 1
    dfs(count,idx+1)
dfs(0,0)
print(result)