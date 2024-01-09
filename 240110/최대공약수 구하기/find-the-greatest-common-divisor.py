a,b = map(int,input().split())

def mgcd(n,m):
    max_val = 0 

    for i in range(2,n):
        if n%i == 0 and m% i == 0 and max_val < i:
            max_val = i 
    print(max_val)
mgcd(a,b)