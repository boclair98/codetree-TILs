import sys 
import heapq 

n,m = map(int,input().split())

INF = sys.maxsize
distance =[INF] *(n+1)
graph = [[] for _ in range(n+1)]

for _ in range(m):
    u,v,w = map(int,input().split())
    graph[v].append((u,w))


def dijkstra(start):
    distance[start] = 0
    q = []
    heapq.heappush(q, (0, start))
    
    while q:
        dist, node = heapq.heappop(q)
        if dist > distance[node]:
            continue
        for next_node, next_dist in graph[node]:
            cost = distance[node] + next_dist
            if cost < distance[next_node]:
                distance[next_node] = cost
                heapq.heappush(q, (cost, next_node))
    
    
dijkstra(n)

ans = 0 

for i in range(1,n+1):
    ans = max(ans,distance[i])
print(ans)