n = int(input())
max_v = 2*10**9
max_val = 0
start = 1 
end = max_v
while start<=end : 
    mid = (start+end) // 2 
    if mid * (mid+1) //2 <=n:
        start =mid + 1
        max_val = max(max_val,mid)
    else:
        end = mid - 1
print(max_val)