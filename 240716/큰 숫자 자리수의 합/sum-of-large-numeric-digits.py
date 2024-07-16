num = list(map(int,input().split()))

def recu(n):
    if n<=9:
        return n 
    
    return recu(n//10) + (n%10)

print(recu(num[0]*num[1]*num[2]))