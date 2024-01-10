y = int(input())
def yun(n):

    if n%4 !=0:
        return False
    elif n %100 !=0:
        return True
    elif n%400 !=0:
        return False
    else:
        return True

if yun(y):
    print("true")
else:
    print("false")