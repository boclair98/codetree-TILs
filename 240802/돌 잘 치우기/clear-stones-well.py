from collections import deque
n,k,m = map(int,input().split())
#격자크기 n, 시작점의 수 k, 치워야할 돌의 개수 m 

num = [list(map(int,input().split())) for _ in range(n)]
dx = [0,1,0,-1]
dy = [1,0,-1,0]

def bfs(z,x,m):
    global cnt 
    cnt+=1
    q = deque()
    q.append((z,x))
    visited[z][x] = True 
    while q : 
        x,y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<n and 0<=ny<n:
                if visited[nx][ny] == False and num[nx][ny] == 0:
                    cnt+=1 
                    visited[nx][ny] = True 
                    q.append((nx,ny))
                elif visited[nx][ny] == False and num[nx][ny] ==1:
                    if m > 0 : 
                        cnt+=1
                        visited[nx][ny] = True 
                        q.append((nx,ny))
                        m = m - 1 
    return cnt 
tal = []
for _ in range(k):
    x,y = map(int,input().split())
    x = x - 1
    y = y - 1
    visited = [[False]*n for _ in range(n)]
    cnt = 0 
    tal.append(bfs(x,y,m))
print(max(tal))