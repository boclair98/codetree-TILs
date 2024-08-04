from collections import deque 
from itertools import combinations
n,k,u,d = map(int,input().split())
graph = [list(map(int,input().split())) for _ in range(n)]
dx = [0,1,0,-1]
dy = [1,0,-1,0]
def bfs(i,j,u,d):
    count = 1
    q = deque()
    q.append((i,j))
    visited[i][j] = True 
    while q:
        x,y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<n and 0<=ny<n:
                if visited[nx][ny] == False:
                    if max(graph[x][y],graph[nx][ny]) - min(graph[x][y],graph[nx][ny]) >=u:
                        if max(graph[x][y],graph[nx][ny]) - min(graph[x][y],graph[nx][ny])<=d:
                            count+=1
                            visited[nx][ny] = True 
                            q.append((nx,ny))
    return count 


num = deque()
for i in range(n):
    for j in range(n):
        num.append((i,j))

l = [] 

for x in combinations(num,k):
    x = deque(x)
    visited =[[False] * n for _ in range(n)]
    total = 0 
    for _ in range(k):
        sx,sy = x.popleft()
        total = total+bfs(sx,sy,u,d) 
        l.append(total)
print(max(l))