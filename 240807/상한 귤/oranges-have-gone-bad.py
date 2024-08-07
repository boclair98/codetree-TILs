from collections import deque 
n,k = map(int,input().split())
gull = [list(map(int,input().split())) for _ in range(n)]

dx = [0,1,0,-1]
dy = [1,0,-1,0]
distacne = [[0]*n for _ in range(n)]
distacne2 = [[0]*n for _ in range(n)]
sg = deque()
for i in range(n):
    for j in range(n):
        if gull[i][j] == 2:
            sg.append((i,j))

def bfs(i,j,di):
    q = deque()
    q.append((i,j))
    visited[i][j] = True 
    while q:
        x,y = q.popleft() 
        for k in range(4):
            nx = x + dx[k]
            ny = y + dy[k]
            if 0<=nx<n and 0<=ny<n:
                if visited[nx][ny] == False and gull[nx][ny] == 1 :
                    distacne[nx][ny] = distacne[x][y] + 1 
                    visited[nx][ny] = True 
                    q.append((nx,ny))
                
    return distacne

while sg:
    visited = [[False]* n for _ in range(n)]
    x,y = sg.popleft() 
    tot_distanc = bfs(x,y,distacne)
    for i in range(n):
        for j in range(n):
            if distacne2[i][j] == 0 :
                distacne2[i][j] = tot_distanc[i][j]
            elif distacne2[i][j] > tot_distanc[i][j]:
                distacne2[i][j] = tot_distanc[i][j]

for i in range(n):
    for j in range(n):
        if gull[i][j] == 0 :
            distacne2[i][j] = -1 
        elif gull[i][j] == 1 and distacne2[i][j] == 0:
            distacne2[i][j] = -2
        elif gull[i][j] == 2:
            distacne2[i][j] = 0
            
for i in range(n):
    for j in range(n):
        print(distacne2[i][j],end=' ')
    print()