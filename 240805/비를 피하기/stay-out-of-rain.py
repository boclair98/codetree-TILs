from collections import deque
import copy
n,h,m = map(int,input().split())
rain = [list(map(int,input().split())) for _ in range(n)]
rain2 = copy.deepcopy(rain)

dx = [-1,1,0,0]
dy = [0,0,-1,1]

fir_visited = [[False]*n for _ in range(n)]
for i in range(n):
    for j in range(n):
        if rain[i][j] == 1 or rain[i][j] == 3:
            if fir_visited[i][j] == False:
                fir_visited[i][j] = True 

def bfs(i,j):
    cnt = 0 
    q = deque()
    q.append((i,j))
    visited[i][j] = True 
    while q:
        x,y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<n and 0<=ny<n:
                if visited[nx][ny] == False and rain[nx][ny] == 3 :
                    cnt+=1 
                    return cnt 
                elif visited[nx][ny] == False and (rain[nx][ny] == 0 or rain[nx][ny] == 2):
                    visited[nx][ny] = True 
                    cnt+=1 
                    q.append((nx,ny))
    return -1 

for i in range(n):
    for j in range(n):
        if rain[i][j] == 2:
            visited = [[False]*n for _ in range(n)]
            tal=bfs(i,j)
            rain2[i][j] = tal
print(rain)
print(rain2)