from collections import deque 

n = int(input())
r1,c1,r2,c2 = map(int,input().split())
chess = [[0]*n for _ in range(n)]
visited = [[False]*n for _ in range(n)]
dx = [-2,-2,-1,1,2,2,1,-1]
dy = [-1,1,2,2,1,-1,-2,-2]

def bfs(i,j):
    q = deque()
    q.append((i,j))
    if i == r2 and j == c2:
        return 0 
    while q: 
        x,y = q.popleft()
        if x == r2 and y == c2:
            chess[x][y] +=1 
            return chess[x][y]
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<n and 0<=ny<n:
                q.append((nx,ny))
                chess[nx][ny] = chess[x][y] + 1 
                if nx == r2 and ny == c2:
                    return chess[nx][ny]
    return -1


print(bfs(r1,c1))