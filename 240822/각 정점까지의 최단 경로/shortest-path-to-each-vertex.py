import heapq 
import sys 

n, m = map(int, input().split())
start = int(input())
INF = sys.maxsize 
distance = [INF] *(n+1)
graph = [[] for _ in range(n+1)]

for _ in range(m):
    u,v,w = map(int,input().split())
    graph[u].append((v,w))
    graph[v].append((u,w))

def dstra(start):
    q = [] 
    heapq.heappush(q,(0,start))
    distance[start] = 0

    while q: 
        dist,node = heapq.heappop(q)

        if dist > distance[node] : 
            continue 
        
        for nx,cost in graph[node]:
            total = cost + distance[node]
            if total < distance[nx]:
                distance[nx] = total 
                heapq.heappush(q,(total,nx))
dstra(start)
for i in range(1,n+1):
    if distance[i] == INF:
        print(-1)
    else:
        print(distance[i])