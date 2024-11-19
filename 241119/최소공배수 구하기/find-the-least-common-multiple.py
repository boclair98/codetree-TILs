n,m = map(int,input().split())


def gcm(n,m):
    num = max(n,m)
    cnt = 1
    while True:
        if num % n == 0 and num % m == 0:
            print(num)
            break
        cnt+=1
        num*=cnt

gcm(n,m)