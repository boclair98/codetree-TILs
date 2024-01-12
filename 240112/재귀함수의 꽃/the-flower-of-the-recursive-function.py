n = int(input())

def printnum(n):
    if n == 0 :
        return 
    print(n,end=' ')
    printnum(n-1)
    print(n,end=' ')
printnum(n)