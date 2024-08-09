n, m = map(int,input().split())
num = list(map(int,input().split()))
num.sort()
def binary(s):
    start = 0
    end = n - 1
    idx = n 
    while start <=end:
        mid = (start+end) // 2
        if num[mid]>s:
            idx = min(idx,mid)
            end = mid - 1
        else:
            start = mid + 1
    return idx

def binary2(s):
    start = 0
    end = n - 1
    idx = n 
    while start <=end:
        mid = (start+end) // 2
        if num[mid]>=s:
            idx = min(idx,mid)
            end = mid - 1
        else:
            start = mid + 1
    return idx 

for _ in range(m):
    s,y = map(int,input().split())
    print(binary(y) - binary2(s))