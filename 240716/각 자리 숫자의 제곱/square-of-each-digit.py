n = int(input())

def recu(n):
    if n < 10 :
        return n ** 2 
    
    return recu(n//10) + (n%10) ** 2

print(recu(n))