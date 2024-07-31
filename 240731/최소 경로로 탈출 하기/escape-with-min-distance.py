from collections import deque 
n, m = map(int,input().split())
num = [list(map(int,input().split())) for _ in range(n)]
dx = [0,1,0,-1]
dy = [1,0,-1,0]
x,y = 0 , 0
visited = [[False]*(m) for _ in range(n)] 
def bfs(x,y):
    q = deque() 
    q.append((x,y))
    while q:
        x1,y1 = q.popleft()
        for i in range(4):
            nx = x1 + dx[i]
            ny = y1 + dy[i]
            if 0<=nx<n and 0<=ny<m:
                if num[nx][ny] == 1 and visited[nx][ny] == False:
                    visited[nx][ny] = True
                    q.append((nx,ny))
                    num[nx][ny] = num[x1][y1] + 1

    return num[n-1][m-1]

print(bfs(x,y)-1)