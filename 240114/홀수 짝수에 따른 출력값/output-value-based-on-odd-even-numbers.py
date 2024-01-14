n = int(input())

def val(n):
    if n == 1:
        return 1
    if n== 2:
        return 2
    
    return n+val(n-2)
print(val(n))