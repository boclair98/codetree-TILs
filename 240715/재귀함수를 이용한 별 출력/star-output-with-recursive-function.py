n = int(input())

def recu(n):
    if n == 0:
        return 
    recu(n-1)
    print('*'*n)

recu(n)