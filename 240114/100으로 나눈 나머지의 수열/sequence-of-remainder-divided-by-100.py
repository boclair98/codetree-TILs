n = int(input())

def fact(num):
    if num == 1:
        return 2
    if num == 2:
        return 4
    
    return fact(num-1) * fact(num-2) % 100

print(fact(n))