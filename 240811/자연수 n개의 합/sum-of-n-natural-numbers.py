n = int(input())
max_v = 10000000
max_val = 0
start = 1 
end = max_v
while start<=end : 
    mid = (start+end) // 2 
    if mid * (mid+1)//2 <=s:
        left =mid + 1
        max_val = max(max_val,mid)
    else:
        end = mid - 1
print(max_val)