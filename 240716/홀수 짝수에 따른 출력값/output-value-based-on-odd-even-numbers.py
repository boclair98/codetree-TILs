n = int(input())

def recu(n):
    if n  == 1:
        return 1
    if n == 2:
        return 2
    return recu(n-2) + n
        
print(recu(n))