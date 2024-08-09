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
            end = mid - 1
            idx = min(idx,mid)
        else:
            start = mid + 1
    return idx + 1

for i in num2:
    t = binary(i) 
    if t<=n and num[t] == i:
        print(t)
    else:
        print(-1)