n = int(input())
def sums(n):
    if n == 1:
        return 1
    if n == 2:
        return 2;
    return sums(n//3) + sums(n-1)
print(sums(n))