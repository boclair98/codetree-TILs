a,b,c = map(int,input().split())

def mins (a,b,c):
    if a < b and a < c:
        return a 
    elif b < a and b < c:
        return b
    return c 

print(mins(a,b,c))