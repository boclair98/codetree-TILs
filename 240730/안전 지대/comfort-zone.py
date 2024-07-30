import sys
sys.setrecursionlimit(10**5)
n, m = map(int,input().split())
num = [list(map(int,input().split())) for _ in range(n)]
max_val = 0 
dx = [0,1,0,-1]
dy = [1,0,-1,0]

for i in range(n):
    for j in range(m):
        if max_val<num[i][j]:
            max_val = num[i][j]

def dfs(visited,cnt,x,y):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0<=nx<n and 0<=ny<m:
            if visited[nx][ny] ==False and num[nx][ny]>cnt:
                visited[nx][ny] = True 
                dfs(visited,cnt,nx,ny)
    return 
count = [] 
for cnt in range(1,max_val+1):
    visited = [[False]*m for _ in range(n)]
    total = 0 
    for i in range(n):
        for j in range(m):
            if num[i][j] > cnt and visited[i][j]==False :
                visited[i][j] = True
                total+=1
                dfs(visited,cnt,i,j)

    count.append((cnt,total))

count.sort(lambda x :(x[1],-x[0]),reverse = True)
print(count[0][0],count[0][1])