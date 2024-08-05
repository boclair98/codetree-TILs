from collections import deque
import copy
n,h,m = map(int,input().split())
rain = [list(map(int,input().split())) for _ in range(n)]
rain2 = copy.deepcopy(rain)
rain3 = [[0]* n for _ in range(n)]
dx = [-1,1,0,0]
dy = [0,0,-1,1]

fir_visited = [[False]*n for _ in range(n)]
for i in range(n):
    for j in range(n):
        if rain[i][j] == 1 or rain[i][j] == 3 or rain[i][j]==0:
            if fir_visited[i][j] == False:
                fir_visited[i][j] = True

def bfs(i,j):
    q = deque()
    q.append((i,j))
    while q: 
        x,y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<n and 0<=ny<n:
                if visited[nx][ny] == False and ((rain[nx][ny]==0 or rain[nx][ny]==2)):
                    visited[nx][ny] = True 
                    q.append((nx,ny))
                    rain3[nx][ny] = rain3[x][y] + 1 
                if visited[nx][ny] == False and (rain[nx][ny]==3):
                    return rain3[nx][ny] 
    return -1
                

for i in range(n):
    for j in range(n):
        if rain2[i][j] == 2 : 
            visited = [[False] * n for _ in range(n)] 
            visited[i][j] = True
            tal = bfs(i,j)
            rain2[i][j] = tal 

for i in range(n):
    for j in range(n):
        if fir_visited[i][j] == True :
            print(0,end=' ')
        else:
            print(rain2[i][j],end=' ')
    print()