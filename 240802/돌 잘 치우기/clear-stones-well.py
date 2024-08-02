from collections import deque
n,k,m = map(int,input().split())
#격자크기 n, 시작점의 수 k, 치워야할 돌의 개수 m 

num = [list(map(int,input().split())) for _ in range(n)]
dx = [0,1,0,-1]
dy = [1,0,-1,0]

number = []

def first_bfs(i,j):
    cnt = 0 
    q = deque()
    q.append((i,j))
    while q : 
        x,y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<n and 0<=ny<n:
                if num[nx][ny] == 0:
                    cnt+=1
                elif num[nx][ny] ==1 :
                    cnt-=1
    return cnt

def bfs(i,j):
    q = deque()
    q.append((i,j))
    visited[i][j] = True
    cnt = 1  
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
    return cnt  



for i in range(n):
    for j in range(n):
        if num[i][j] == 1 : 
            number.append((i,j,first_bfs(i,j)))
number.sort(key = lambda x : (-x[2],-x[0]))

for i in range(m):
    x,y,cnt = number[i]
    num[x][y] = 0

max_val = 0 
for _  in range(k):
    x , y = map(int,input().split())
    x = x - 1
    y = y - 1
    visited = [[False]*n for _ in range(n)]
    max_val = max(max_val,bfs(x,y))
print(max_val)