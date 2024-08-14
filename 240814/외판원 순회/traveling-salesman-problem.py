n = int(input())
num = [list(map(int,input().split())) for _ in range(n)]
visited = [False] * n 
visited2 = [False] * n 
min_val = 100000000
def backtrack(start,total):
    global min_val
    if start == n :

        min_val = min(min_val,total)
        return 
    
    for i in range(n):
        if visited[i] == False:
            visited[i] = True 
            
            backtrack(start+1,total+num[(n-i)%n][n-i-1])
            visited[i] = False
    
    

backtrack(0,0)
print(min_val)