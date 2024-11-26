n = int(input())
def sums(n):
    if n == 1:
        return 1
    if n == 2:
        return 2
    
    return n + sums(n-2)

print(sums(n))