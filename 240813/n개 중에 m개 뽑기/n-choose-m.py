n, m = map(int,input().split())
tal = [] 
visited = [False] * (n+1) 
def back(s): 
    if len(tal) == m:
        print(" ".join(map(str,tal)))
        return 
    for i in range(s,n+1):
        if visited[i] == False:
            visited[i] = True 
            tal.append(i)
            back(i+1)
            visited[i] = False
            tal.pop()
back(1)