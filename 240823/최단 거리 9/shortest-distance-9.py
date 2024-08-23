import sys 
import heapq 

INF = sys.maxsize 

n,m = map(int,input().split())

distance = [INF] *(n+1)
graph =[[] for _ in range(n+1)]
for _ in range(m):
    u,v,w = map(int,input().split())
    graph[u].append((v,w))
    graph[v].append((u,w))

start,end = map(int,input().split())
path = [0 for _ in range(n+1)]
def dijkstra(start,end):
    q = []
    heapq.heappush(q,(0,start))
    distance[start] = 0 
    while q: 
        dist,node = heapq.heappop(q)
        if dist > distance[node] : 
            continue 
        
        for nodes,costs in graph[node]:
            cost = costs+ distance[node]
            if cost < distance[nodes]:
                distance[nodes] = cost 
                path[nodes] = node 
                heapq.heappush(q,(cost,nodes))
dijkstra(start,end)
print(distance[end])

x = end
ret =[x] 
while x!=start:
    x = path[x]
    ret.append(x)
print(" ".join(map(str,ret[::-1]) ))