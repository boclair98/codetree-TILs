n = int(input())

def printstat(n):
    if n == 0:
        return 
    
    print("* "*n)
    printstat(n-1)
    print("* "* n)
printstat(n)