n,t = map(int,input().split())
x,y,alpha = map(str,input().split())
x = int(x)
y = int(y)
graph = [[0]*n for _ in range(n)]

if alpha =='R':
    shape = "Right"
    while t > 0:
        if shape == 'Right':
            y+=1
            if y == n:
                t -=1
                shape ='Left'
            else:
                t-=1
        else:
            y-=1
            if y == 1:
                t-=1
                shape ="Right"
            else:
                t-=1 
    print(x,y)
elif alpha == "L":
    shape = "Left"
    while t>0:
        if (shape == "Left"):
            y-=1
            t-=1
            if y == 1:
                t-=1
                shape = 'Right'
            
        else:
            y+=1
            t-=1
            if y == n:
                t-=1
                shape = 'Left'
            

    print(x,y)
elif alpha == 'U':
    shape = "up"
    while t > 0:
        if (shape == 'up'):
            x-=1
            if x == 1:
                t-=2
                shape ="down"
            else:
                t-=1
        else:
            x+=1
            if x == n:
                t-=2
                shape = "up"
            else:
                t-=1
    print(x+1,y)
elif alpha == 'D':
    shape = "down"
    while t > 0:
        if (shape == 'down'):
            x+=1
            if x == n:
                t-=2
                shape ="up"
            else:
                t-=1
        else:
            x-=1
            if x == 1:
                t-=2
                shape = "down"
            else:
                t-=1
    print(x+1,y)