n = int(input())

city = [list(map(int,input().split())) for _ in range(n)]

visited = [[False]*n for _ in range(n)]

dx = [0,1,-1,0]
dy = [1,0,0,-1]
cnt = 1
def dfs(x,y):
    global cnt 
    visited[x][y] = True 

    for i in range(4) :
        nx = x + dx[i]
        ny = y + dy[i]
        if 0<=nx<n and 0<=ny<n :
            if visited[nx][ny] == False and city[nx][ny] == 1:
                cnt+=1
                dfs(nx,ny)
    return cnt


total = []
for i in range(n):
    for j in range(n):
        if city[i][j] == 1 and visited[i][j] == False:
            cnt = 1
            total.append(dfs(i,j))
            
            
print(len(total))
total.sort()
for i in total:
    print(i)