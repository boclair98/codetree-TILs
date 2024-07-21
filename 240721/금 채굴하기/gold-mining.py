n, k = map(int,input().split())
num = [list(map(int,input().split())) for _ in range(n)]
def coins(x,y):
    total = 0
    cnt = 0
    if 0<=x<n and 0<=y<n:
        if num[x][y] == 1:
            total+=1
            cnt+=1
        else:
            cnt+=1
    else:
        cnt+=1
    
    nx = x + 1
    ny = y 
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1
        else:
            cnt+=1
    else:
        cnt+=1
    
    ny = y - 1
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1
        else:
            cnt+=1
    else:
        cnt+=1
    
    ny = y + 1
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1
        else:
            cnt+=1
    else:
        cnt+=1

    nx = x + 2
    ny = y 
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1
        else:
            cnt+=1
    else:
        cnt+=1

    total *= k 
    if total >= k: 
        return total
    else:
        return 0

def coins2(x,y):
    total = 0
    cnt = 0

    nx = x 
    ny = y 
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1
    else:
        cnt+=1
    
    nx = x + 1 
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1
    else:
        cnt+=1

    ny = y - 1
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1
    else:
        cnt+=1

    ny = y + 1
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1
    else:
        cnt+=1

    nx = x + 2
    ny = y 
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1 
    else:
        cnt+=1

    ny = y - 2 
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1 
    else:
        cnt+=1

    ny = y - 1 
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1 
    else:
        cnt+=1

    ny = y + 1
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1 
    else:
        cnt+=1

    ny = y + 2
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1 
    else:
        cnt+=1

    nx = x + 3
    ny = y
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1 
    else:
        cnt+=1

    ny = y - 1
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1 
    else:
        cnt+=1

    ny = y + 1
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1 
    else:
        cnt+=1

    nx = x+4
    ny = y 
    if 0<=nx<n and 0<=ny<n:
        if num[nx][ny] == 1:
            total+=1
            cnt+=1 
        else:
            cnt+=1 
    else:
        cnt+=1

    total *= k 
    if total >= k: 
        return total 
    else:
        return 0
    

max_coin = 0 
for i in range(n):
    for j in range(n):
        coin = coins(i,j)
        coin2 = coins2(i,j)
        max_coin = max(max_coin,coin,coin2)
print(max_coin//k)