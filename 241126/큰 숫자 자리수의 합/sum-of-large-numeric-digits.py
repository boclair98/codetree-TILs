a,b,c = map(int,input().split())
total = a * b * c
def sums(total):
    if total < 10:
        return total 
    
    return sums(total // 10) + (total % 10)

print(sums(total))