n = int(input())
def sums(n):
    if n == 1:
        return 2
    if n == 2:
        return 4
    
    return (sums(n-1) * sums(n-2)) % 100

print(sums(n))