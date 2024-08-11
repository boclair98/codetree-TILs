n = int(input())
count = 0 
def backtracking(n):
    global count
    while n > 1:
    
        if n % 3 == 0:
            n = n // 3
            count+=1
        elif n % 2 == 0:
            n = n // 2
            count+=1
        else:
            n = n  + 1
            count+=1 
    return count

print(backtracking(n-1))