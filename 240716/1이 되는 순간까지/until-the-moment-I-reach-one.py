n = int(input())
cnt = 0
def recu(n):
    global cnt 
    if n == 1:
        return cnt 
    elif n %2 == 0:
        cnt+=1
        return recu(n//2)
    elif n % 2== 1:
        cnt+=1
        return recu(n//3)

print(recu(n))