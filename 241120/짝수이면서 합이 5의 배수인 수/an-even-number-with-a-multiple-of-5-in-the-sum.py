n = int(input())

def snum(num):
    if num % 2 == 0:
        if (num % 10 + num // 10) % 5 == 0:
            return True 
    return False 

if snum(n):
    print("Yes")
else:
    print("No")