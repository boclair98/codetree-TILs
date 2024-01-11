n = int(input())

def printhello(n):
    if n == 0:
        return 
    printhello(n-1)
    print("HelloWorld")
printhello(n)