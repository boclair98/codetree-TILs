import sys 
import heapq
INF = sys.maxsize
n,m = map(int,input().split())

dist = [INF] *(n+1)

edge = [[] for _ in range(n+1)]

visited = [False] * (n+1)

for _ in range(m):
    u,v,w = map(int,input().split())
    edge[u].append((v,w))


def daijkstra(start):
    q = [] 
    heapq.heappush(q,(0,start))
    dist[start] = 0 

    while q: 
        distance, node = heapq.heappop(q)
        if dist[node] < distance:
            continue 
        
        for nexts in edge[node]:
            cost = dist[node] + nexts[1]
            if cost < dist[nexts[0]]:
                dist[nexts[0]] = cost 
                heapq.heappush(q,(cost,nexts[0]))

daijkstra(1)
for i in range(2,n+1):
    if dist[i] == INF:
        print(-1)
    else:
        print(dist[i])