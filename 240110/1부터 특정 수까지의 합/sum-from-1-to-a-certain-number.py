n = int(input())

def rang(k):
    tal = 0 

    for i in range(1,k+1):
        tal +=i
    
    return tal // 10

print(rang(n))