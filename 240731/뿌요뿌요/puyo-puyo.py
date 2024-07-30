n = int(input())
num = [list(map(int,input().split())) for _ in range(n)]
dx = [0,1,0,-1]
dy = [1,0,-1,0]
max_val = 0 
# 최댓값 구하기 
for i in range(n):
    for j in range(n):
        if max_val < num[i][j]:
            max_val = num[i][j]
#dfs 함수 
def dfs(visited,cnt,x,y):
    global total 
    visited[x][y] = True
    total+=1 
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0<=nx<n and 0<=ny<n:
            if num[nx][ny] == cnt and visited[nx][ny] == False:
                visited[nx][ny] = True 
                dfs(visited,cnt,nx,ny)
    return total 

#담을 리스트 
li = [] 
destory = 0 
#탐색 시작 
for cnt in range(1,max_val+1):
    #방문 경로 초기화 및 생성
    visited = [[False]*n for _ in range(n)]
    total = 0 
    #dfs 실행 
    for i in range(n):
        for j in range(n):
            if num[i][j] == cnt and visited[i][j] == False:
                tal = dfs(visited,cnt,i,j)
                if tal >=4:
                    destory+=1 
                li.append((destory,tal))
                total = 0 

li.sort(key = lambda x:-x[1])
print(destory,li[0][1])