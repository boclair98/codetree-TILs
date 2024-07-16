n = int(input())

def sumt(n):
    if n == 0 :
        return 0
    return sumt(n-1)+n

print(sumt(n))