n = int(input())

def recu(n):
    if n == 1:
        return 2 
    if n == 2:
        return 4
    
    return recu(n-2) * recu(n-1) % 100

print(recu(n))