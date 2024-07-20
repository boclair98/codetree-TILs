k,n = map(int,input().split())
visited = [False] *(k+1)
num = [] 
def backtracking():
    if len(num) == n :
        print(" ".join(map(str,num)))
        return 
    
    for i in range(1,k+1):
        visited[i] = True 
        num.append(i)
        backtracking()
        num.pop()
        visited[i] = False 
backtracking()