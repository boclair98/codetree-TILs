from collections import deque 
n,h,m = map(int,input().split())
rain = [list(map(int,input().split())) for _ in range(n)]
dx = [0,1,0,-1]
dy = [1,0,-1,0]
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
                if visited[nx][ny] == False and rain[nx][ny]==0:
                    cnt+=1
                    visited[nx][ny] = True
                    q.append((nx,ny))  
                elif visited[nx][ny] == False and rain[nx][ny] == 3:
                    cnt+=1 
                    return cnt 
    return -1 
for i in range(n):
    for j in range(n):
        if rain[i][j] == 2:
            visited = [[False]*n for _ in range(n)]
            tal=bfs(i,j)
            rain[i][j] = tal
for i in range(n):
    for j in range(n):
        if rain[i][j] == 1 or rain[i][j]==3:
            print(0,end=' ')
        else:
            print(rain[i][j],end=' ')
    print()