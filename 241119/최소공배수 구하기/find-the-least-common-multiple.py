n,m = map(int,input().split())


def gcm(n,m):
    count = 0 

    for i in range(min(n,m),-1,-1):
        if n % i == 0 and m % i == 0:
            count = i
            break
    
    total =  (n // count) * (m//count) * count 
    print(total)

gcm(n,m)