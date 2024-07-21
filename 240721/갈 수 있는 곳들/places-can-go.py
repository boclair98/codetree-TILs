from collections import deque 
n,k = map(int,input().split())
num = [list(map(int,input().split())) for _ in range(n)]
visited = [[False]*n for _ in range(n)]
cnt = 0
dx = [1,0,-1,0]
dy = [0,1,0,-1]

def bfs(x,y):
    global cnt 
    q = deque()
    q.append((x,y))
    while q : 
        x1,y1 = q.popleft()
        for i in range(4):
            nx = x1+dx[i]
            ny = y1+dy[i]
            if 0<=nx<n and 0<=ny<n :
                if visited[nx][ny] == False and num[nx][ny] == 0:
                    cnt+=1 
                    visited[nx][ny] = True
                    q.append((nx,ny))
    return cnt 

if n == 1 and k == 1:
    print(1)
else:
    for _ in range(k):
        x,y = map(int,input().split())
        
        if visited[x-1][y-1] == False:
            tal = bfs(x-1,y-1)
    print(tal)