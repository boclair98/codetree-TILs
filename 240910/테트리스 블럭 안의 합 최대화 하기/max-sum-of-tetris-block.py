n,m = map(int,input().split())
graph = [list(map(int,input().split())) for _ in range(n)]

#테스티스 1 
def first(i,j):
    val = 0 
    if j + 3 <= m-1:
        val = graph[i][j]+graph[i][j+1]+graph[i][j+2]+graph[i][j+3]
    return val 

#테스리스 2 
def second(i,j):
    val = 0 
    if i+1<=n-1 and j+1<=m-1:
        val = graph[i][j] + graph[i+1][j] + graph[i][j+1]+graph[i+1][j+1]
    return val 

#테트리스3
def third(i,j):
    val = 0 
    if i+2<=n-1 and j+1<=m-1:
        val = graph[i][j] + graph[i+1][j] + graph[i+2][j] + graph[i+2][j+1]
    return val 

#4시작
def four(i,j):
    val = 0 
    if i+2<=n-1 and j+1<=m-1:
        val = graph[i][j] + graph[i+1][j] + graph[i+1][j+1] + graph[i+2][j+1]
    return val 

#5시작
def five(i,j):
    val = 0
    if i+2<=n-1 and j+1<=m-1:
        val = graph[i][j] + graph[i+1][j+1] + graph[i+2][j] + graph[i+2][j]
    return val 



max_val = 0 
for i in range(n):
    for j in range(m):
        #테트리스 1 시작 
        fir = first(i,j)
    
        #테트리스 2 시작
        sec = second(i,j)

        #3시작
        thr = third(i,j)

        #4시작 
        fo = four(i,j)

        #5시작
        fiv = five(i,j)
        
        max_val = max(max_val,fir,sec,thr,fo,fiv)
print(max_val)