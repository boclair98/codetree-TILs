n = int(input())


x ,y = 0,0
dir_num = 0
graph = [[0]*10 for _ in range(10)]

dx = [0,-1,0,1]
dy = [1,0,-1,0]
cnt = 0
ans = -1
def move(dir_num,b):
    global x,y,cnt,ans
    for _ in range(b):
        x,y = x+dx[dir_num],y+dy[dir_num]
        cnt+=1

        if x == 0 and y == 0:
            ans = cnt
            return True

    return False

for _ in range(n):
    a,b = map(str,input().split())
    b = int(b)
    if a == 'N':
        dir_num = 3
        
    elif a == 'W':
        dir_num = 2
    elif a == "S":
        dir_num = 1
    else:
        dir_num = 0
    
    done = move(dir_num,b)

    if done:
        break
print(ans)