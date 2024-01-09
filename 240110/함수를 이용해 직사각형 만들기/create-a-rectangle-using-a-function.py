a,b = map(int,input().split())

def one(n,m):
    for i in range(n):
        for j in range(m):
            print("1",end='')
        print()
one(a,b)