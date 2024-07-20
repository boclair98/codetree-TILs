n, m = map(int,input().split())
graph = [[] for _ in range(n+1)]
visited = [False] *(n+1)
cnt = 0 
def dfs(start):
    global cnt 
    if visited[start] == False:
        visited[start] = True 
    for i in graph[start]:
        if visited[i] == False:
            visited[i] = True
            cnt+=1 
            dfs(i)
    return cnt 
for _ in range(m):
    a,b=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

print(dfs(1))