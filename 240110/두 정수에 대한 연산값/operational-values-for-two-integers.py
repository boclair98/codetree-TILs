a,b = map(int,input().split())

def min_max(x,y):
    if x>y :
        x = x+25
        y = y*2
    else:
        x = x * 2
        y = y + 25
    return x,y
print(min_max(a,b))