a,b=map(int,input().split())

def gudem(x,y):
    tal = 1;

    for _ in range(y):
        tal  = tal * x
    return tal
print(gudem(a,b))