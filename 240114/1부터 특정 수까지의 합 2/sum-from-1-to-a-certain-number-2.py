n = int(input())

def add(num):
    if num == 1:
        return 1
    
    return add(num-1) + num

print(add(n))