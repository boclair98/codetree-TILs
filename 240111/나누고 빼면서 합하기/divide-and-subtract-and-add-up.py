a,b= map(int,input().split())
arr = [0]+list(map(int,input().split()))

def oneso(arr):
    global b 
    tal  = 0 
    while (b>=1):
        tal +=arr[b]
        if b%2 == 0:
            b = b//2
        else:
            b = b-1
    return tal

    
print(oneso(arr));