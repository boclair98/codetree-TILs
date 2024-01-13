n = int(input())
cnt = 0 
def jaknum(n):
    global cnt 

    if n == 1:
        return cnt
    
    elif n%2 == 0:
        cnt+=1
        return jaknum(n // 2)
    else:
        cnt+=1
        return jaknum(n//3)
print(jaknum(n))