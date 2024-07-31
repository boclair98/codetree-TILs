from collections import deque 
n = int(input())
sx,sy,ex,ey = map(int,input().split())
num = [[0]*n for _ in range(n)]
dx = [2,2,1,-1,-2,-2,-1,1]
dy = [-1,1,2,2,1,-1,-1,-1]
visited = [[False]*n for _ in range(n)]
def bfs(x,y,ex,ey):
    q = deque()
    q.append((x,y))
    while q: 
        x1,y1 = q.popleft() 
        for i in range(8):
            nx = x1 + dx[i]
            ny = y1 + dy[i]
            if nx == ex and ny == ey : 
                return num[nx-1][ny-1]
            if 0<=nx<n and 0<=ny<n:
                if visited[nx][ny] == False:
                    visited[nx][ny] = True 
                    q.append((nx,ny))
                    num[nx][ny] = num[x1][y1]+1 
    
    return num 


print(bfs(sx-1,sy-1,ex-1,ey-1)+1)