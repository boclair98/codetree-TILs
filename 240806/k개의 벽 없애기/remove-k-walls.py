from collections import deque 
from itertools import combinations
n,k = map(int,input().split())
num = [list(map(int,input().split())) for _ in range(n)]
visited = [[False]*n for _ in range(n)]
visited2 = [[False]*n for _ in range(n)]
sx,sy = map(int,input().split())
ex,ey = map(int,input().split())
sx,sy,ex,ey = sx-1,sy-1,ex-1,ey-1
dx = [0,1,0,-1]
dy = [1,0,-1,0]

#1의 위치를 찾는다.
one_c = [] 
for i in range(n):
    for j in range(n):
        if num[i][j] == 1:
            one_c.append((i,j))

def bfs(s,y,k,visited,visited2):
    q = deque()
    q.append((s,y))
    visited[s][y] = True
    cnt = 0  
    while q: 
        x,y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx == ex and ny == ey:
                return cnt
            if 0<=nx<n and 0<=ny<n:
                if visited[nx][ny] == False and num[nx][ny] == 0:
                    
                    visited[nx][ny] = True 
                    q.append((nx,ny))
                elif visited[nx][ny] == False and num[nx][ny] == 1 and visited2[nx][ny] == True :
                    
                    visited[nx][ny] = True 
                    q.append((nx,ny))
        cnt+=1

    return -2

total_list = []
for i in combinations(one_c,k):
    tal = deque(i)
    visited = [[False]*n for _ in range(n)]
    visited2 = [[False]*n for _ in range(n)]
    while tal :
        x,y = tal.popleft() 
        visited2[x][y] = True 

    total = bfs(sx,sy,k,visited,visited2)
    
    if total > 0 :
        total_list.append(total) 
if len(total_list) == 0:
    print(-1)
else:
    print(min(total_list))