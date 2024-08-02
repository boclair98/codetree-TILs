n,k = map(int,input().split())

tal = []
visited = [False] * (n+1) 
def backtracking():
    if len(tal) == k:
        print(" ".join(map(str,tal)))
        return 
    for i in range(1,n+1):
        if visited[i] == False:
            visited[i] = True 
            tal.append(i)
            backtracking()
            tal.pop()
            visited[i] = False 
backtracking()