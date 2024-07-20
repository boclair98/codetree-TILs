n, m = map(int,input().split())

graph = [list(map(int,input().split())) for _ in range(n)]
visited = [[False]*(m) for _ in range(n)]
dx  = [0,1]
dy = [1,0]
def dfs(x,y):
    visited[x][y] = True 
    
    for i in range(2):
        nx = x+dx[i]
        ny = y+dy[i]
        if 0<=nx<n and 0<=ny<m:
            if visited[nx][ny] == False and graph[nx][ny] == 1:
                visited[nx][ny] = True 
                graph[nx][ny]+=1
                dfs(nx,ny)
    return graph[n-1][m-1]

num = dfs(0,0)
if num == 1:
    print(0)
else:
    print(1)