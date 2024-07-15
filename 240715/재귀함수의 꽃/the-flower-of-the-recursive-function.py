n = int(input())

def recu(n):
    if n == 0:
        return
    print(n,end=' ') 
    recu(n-1)
    print(n,end=' ')
recu(n)