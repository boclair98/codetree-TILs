n = int(input())

def number(n):
    if n == 0 :
        return 
    number(n-1)
    print(n,end=' ')

def numberre(n):

    if n == 0:
        return 
    print(n,end=' ')
    numberre(n-1)

number(n)
print()
numberre(n)