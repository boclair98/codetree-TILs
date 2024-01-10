n = int(input())

def su(a):

    return a%2==0 and ((a//10)  + (a%10)) % 5==0

if su(n):
    print("Yes")
else:
    print("No")