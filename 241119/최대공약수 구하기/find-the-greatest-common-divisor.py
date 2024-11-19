n,m = map(int,input().split())

def gcd(num1,num2):
    if num1 > num2:
        count = num2 
        while True:
            if num1 % count == 0 and num2 % count == 0:
                print(count)
                break
            count-=1
    else:
        count = num1
        while True:
            if num1 % count  == 0 and num2 % count == 0:
                print(count)
                break
            count-=1

gcd(n,m)