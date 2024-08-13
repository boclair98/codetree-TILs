n = int(input())
num = [list(map(int,input().split())) for _ in range(n)]
visited = [False] * n
hap = 10000000  
def back(s,total):
    global hap
    if s==n:
        hap = min(hap,total)
        return 
    
    for i in range(n):
        if num[s][i] == 0:
            continue
        if visited[i] == False:
            visited[i] = True
            back(s+1,total+num[s][i]) 
            visited[i] = False
    
back(0,0)
print(hap)