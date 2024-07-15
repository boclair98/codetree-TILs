n = int(input())

def recu(n):
    if n == 0:
        return 
    recu(n-1)
    print(n,end=' ')

def recu2(n):
    if n == 0:
        return 
    print(n,end=' ')
    recu2(n-1)

recu(n)
print()
recu2(n)