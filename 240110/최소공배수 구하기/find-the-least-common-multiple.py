a,b = map(int,input().split())

def gong(n,m):
    tal = n;

    while (True):
        if tal % m == 0:
            break
        tal = tal+n;
    print(tal)
gong(a,b)