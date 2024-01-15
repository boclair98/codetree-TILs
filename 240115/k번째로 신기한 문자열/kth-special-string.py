n , k , t = map(str,input().split())
n,k = int(n),int(k)

arr = []

new_arr = []

len_t = len(t)

for _ in range(n):
    arr.append(input())

for i in range(n):
    if arr[i][:len_t] == t:
        new_arr.append(arr[i])
new_arr.sort()
print(new_arr[k-1])