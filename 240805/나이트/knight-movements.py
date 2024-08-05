from collections import deque 

n = int(input())
r1,c1,r2,c2 = map(int,input().split())
r1,c1,r2,c2 = r1-1,c1-1,r2-1,c2-1
chess = [[0]*n for _ in range(n)]
dx = [-2,-2,-1,1,2,2,1,-1]
dy = [-1,1,2,2,1,-1,-2,-2]
visited= [[False]*n for _ in range(n)]
def bfs(i,j):
    q = deque()
    q.append((i,j))
    visited[i][j] = True 
    if i == r2 and j == c2:
        return 0 
    while q: 
        x,y = q.popleft()
        if x == r2 and y == c2:
            chess[x][y] +=1 
            return chess[r2][c2]
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<n and 0<=ny<n and not visited[nx][ny]:
                q.append((nx,ny))
                visited[nx][ny] = True 
                chess[nx][ny] = chess[x][y] + 1 
                if nx == r2 and ny == c2:
                    return chess[r2][c2]
    return -1


print(bfs(r1,c1))