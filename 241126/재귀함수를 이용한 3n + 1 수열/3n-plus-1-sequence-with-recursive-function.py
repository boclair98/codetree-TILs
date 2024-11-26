n = int(input())
def sums(n):
    if n == 1:
        return 0
    
    if n % 2 == 0:
        return sums(n//2) + 1
    else:
        return sums(n*3+1) + 1
print(sums(n))