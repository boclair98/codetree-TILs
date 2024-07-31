from collections import deque 
n = int(input())
sx,sy,ex,ey = map(int,input().split())
sx,sy,ex,ey = sx-1,sy-1,ex-1,ey-1
num = [[0]*n for _ in range(n)]
dx = [2,2,1,-1,-2,-2,-1,1]
dy = [-1,1,2,2,1,-1,-1,-1]
visited = [[False]*n for _ in range(n)]
cnt = 0 
def bfs(x,y,ex,ey,count):
    q = deque()
    q.append((x,y))
    while q: 
        x1,y1= q.popleft()
        count = 1
        for i in range(8):
            nx = x1 + dx[i]
            ny = y1 + dy[i]
            if nx == ex and ny == ey :
                num[ex][ey] = count  
                return num[ex][ey]
            if 0<=nx<n and 0<=ny<n:
                if visited[nx][ny] == False:
                    visited[nx][ny] = True 
                    q.append((nx,ny))
                    num[nx][ny]  = count 
                    count+=1
                    
                    
    
    return -1


print(bfs(sx,sy,ex,ey,1)+1)