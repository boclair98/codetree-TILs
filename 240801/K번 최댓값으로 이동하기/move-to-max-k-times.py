from collections import deque 
n , k = map(int,input().split())
num = [list(map(int,input().split())) for _ in range(n)]
r,c = map(int,input().split())
r,c = r-1 , c-1 
dx = [0,1,0,-1]
dy = [1,0,-1,0]
count = 0
first = num[r][c]

def bfs(r,c,first):
    q = deque() 
    q.append((r,c))
    visited = [[False]*n for _ in range(n)] 
    visited[r][c] = True 
    tal = []
    while q : 
        x,y = q.popleft() 
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<n and 0<=ny<n:
                if visited[nx][ny] == False and first >num[nx][ny]:
                    visited[nx][ny] = True 
                    q.append((nx,ny))
                    tal.append((nx,ny,num[nx][ny]))
    tal.sort(key = lambda x:(-x[2],x[0],x[1]))
    if tal :
        return tal[0]
    else:
        return r,c,first 

for i in range(k):
    r,c,first=bfs(r,c,num[r][c]) 
print(r+1,c+1)