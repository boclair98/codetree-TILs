n  = int(input())
tal = 1
def factorial(num):
    if num == 0:
        return 1
    
    return factorial(num-1) * num

print(factorial(n))