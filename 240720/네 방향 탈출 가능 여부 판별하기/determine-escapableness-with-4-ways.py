from collections import deque
n , m = map(int,input().split())

graph = [list(map(int,input().split())) for _ in range(n)]
visited = [[False]*(m) for _ in range(n)] 
dx = [0,1,0,-1]
dy = [1,0,-1,0]


def bfs(x,y):
    visited[x][y] = True 
    q= deque() 
    q.append((x,y))
    while q:
        x,y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0<=nx<n and 0<=ny<m:
                if visited[nx][ny] == False and graph[nx][ny] == 1:
                    visited[nx][ny] = True 
                    q.append((nx,ny))
                    graph[nx][ny] = graph[x][y] + 1
    
    return graph[n-1][m-1]

t = bfs(0,0)
if t == 1:
    print(0)
else:
    print(1)