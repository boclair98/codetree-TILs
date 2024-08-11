n = int(input())
dic = {}
for _ in range(n):
    b = list(input().lower())
    b.sort()
    t = ''.join(map(str,b))
    if t not in dic:
        dic[t] = 1
    else:
        dic[t] +=1
max_val = 0
for i in dic:
    s = dic[i]
    max_val = max(max_val,s)
print(max_val)