n = int(input())



def recu(n):
    
    if n == 1 :
        return 0
    
    elif n% 2 == 0:
        
        return recu(n//2) + 1
    elif n % 2 == 1:
        
        return recu(n*3+1) + 1
    
print(recu(n))