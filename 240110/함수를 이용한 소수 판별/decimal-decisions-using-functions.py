a,b = map(int,input().split())

def sosu(i):
    
    for k in range(2,i):
        if i% k == 0:
            return False
    return True

tal = 0 

for i in range(a,b+1):
    if sosu(i):
        tal = tal + i 
print(tal)