n = int(input())

visited = [False] * (n+1) 

tal = []
def back():
    if len(tal) == n:
        print(" ".join(map(str,tal)))
        return 
    
    for i in range(1,n+1):
        if visited[i] == False:
            visited[i] = True 
            tal.append(i)
            back()
            visited[i] = False
            tal.pop()
back()