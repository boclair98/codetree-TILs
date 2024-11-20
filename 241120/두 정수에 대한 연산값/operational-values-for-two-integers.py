a,b = map(int,input().split())

def change(a,b):
    if a < b:
        b+=25
        a*=2
    else:
        a+=25
        b*=2
    
    return a,b

c,d = change(a,b)
print(c,end=' ')
print(d)