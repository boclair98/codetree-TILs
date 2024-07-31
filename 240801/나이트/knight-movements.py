from collections import deque 
n = int(input())
sx,sy,ex,ey = map(int,input().split())
sx,sy,ex,ey = sx-1,sy-1,ex-1,ey-1
num = [[0]*n for _ in range(n)]
dx = [2,2,1,-1,-2,-2,-1,1]
dy = [-1,1,2,2,1,-1,-1,-1]
visited = [[False]*n for _ in range(n)]
count = 1 

def bfs(sx,sy,count):
    q = deque()
    q.append((sx,sy))
    visited[sx][sy] = True 
    while q : 
        x,y = q.popleft()
        if x == ex and y == ey : 
            
            return num[ex][ey]
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<n and 0<=ny<n:
                if visited[nx][ny] == False:
                    num[nx][ny] = num[x][y] + 1
                    visited[nx][ny] = True 
                    q.append((nx,ny))
        
    
    return -1


print(bfs(sx,sy,count))