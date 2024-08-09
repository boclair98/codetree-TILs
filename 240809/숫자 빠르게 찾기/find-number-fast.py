n ,k = map(int,input().split())
num = list(map(int,input().split()))

def binary(x):
    
    start = 0 
    end = n - 1
    while start<=end:
        mid = (start+end) // 2 
        if num[mid] == x:
            return mid + 1
        elif num[mid] < x:
            start = mid + 1
            
        else:
            
            end = mid - 1
    return -1  

for _ in range(k):
    s = int(input())
    print(binary(s))