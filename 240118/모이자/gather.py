n = int(input())

num = list(map(int,input().split()))

min_val = 1000000
for i in range(n):

    val = 0

    for j in range(n):
        val += num[j] * abs(j-i);
    min_val = min(min_val,val)
print(min_val)