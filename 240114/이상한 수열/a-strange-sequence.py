n = int(input())

def suyeol(num):
    if num == 1:
        return 1
    if num == 2:
        return 2
    
    return suyeol(num//3) + suyeol(num-1)

print(suyeol(n))