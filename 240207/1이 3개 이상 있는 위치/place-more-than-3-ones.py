import sys
sys.setrecursionlimit(10**6)
n = int(input())

graph = [list(map(int,input().split())) for _ in range(n)]
dx = [1,0,-1,0]
dy = [0,-1,0,1]

def dfs(x,y):
    cnt = 0
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0<=nx<n and 0<=ny<n:
            if graph[nx][ny] == 1:
                cnt+=1
    return cnt
total = 0
for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            if dfs(i,j)>=3 :
                total+=1
print(total)