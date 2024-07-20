n, m = map(int,input().split())

num = [list(map(int,input().split())) for _ in range(n)]

def first_case(x,y):
    tal = 0 
    if x <= n-2 and y <=n-2:
        tal = num[x][y] + num[x+1][y] + num[x+1][y+1]
    return tal  

def second_case(x,y):
    tal = 0 
    if x>=0 and x<=n-2 and y > 0:
        tal = num[x][y] + num[x+1][y] + num[x+1][y-1]
    return tal 
def third_case(x,y):
    tal = 0 
    if x>=0 and x<=n-2 and y >= 0 and y<=n-2:
        tal = num[x][y] + num[x][y+1] + num[x+1][y+1]
    return tal 
def four_case(x,y):
    tal = 0 
    if x>=0 and x<=n-2 and y > 0:
        tal = num[x][y] + num[x][y-1] + num[x+1][y-1]
    return tal 

def five_case(x,y):
    tal = 0 
    if y<=n-3:
        tal = num[x][y]+num[x][y+1]+num[x][y+2]
    return tal

def six_case(x,y):
    tal = 0 
    if x<=n-3:
        tal = num[x][y]+num[x+1][y]+num[x+2][y]
    return tal
max_cnt = 0
for i in range(n):
    for j in range(m):
        fir = first_case(i,j)
        sec = second_case(i,j)
        thi = third_case(i,j)
        four = four_case(i,j)
        five = five_case(i,j)
        six = six_case(i,j)
        max_cnt = max(max_cnt,fir,sec,thi,four,five,six)
print(max_cnt)