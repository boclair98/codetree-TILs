n,m = map(int,input().split())
num = list(map(int,input().split()))
num2 = list(map(int,input().split()))
def binary(k):
    idx = n 
    start = 0
    end = n -1
    while start <= end:
        mid = (start+end) // 2
        if num[mid] >= k:
            idx = min(idx,mid)
            end = mid - 1
        else:
            start = mid + 1
    return idx 

for i in num2:
    t = binary(i)
    if t<=n and num[t] == i:
        print(t+1)
    else:
        print(-1)