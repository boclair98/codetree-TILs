n = int(input())
num = [list(map(int,input().split())) for _ in range(n)]
total = 0 
visited = [False]* n 
def back(x,hap):
    global total 
    if x == n :
        total = max(total,hap)
        return 
    for i in range(n):
        if visited[i] == False:
            visited[i] = True 
            back(x+1,hap+num[x][i])
            visited[i] = False 

back(0,0)
print(total)