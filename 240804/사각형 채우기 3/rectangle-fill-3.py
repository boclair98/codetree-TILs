n = int(input())
num = [2,7,22]
for i in range(2,n):
    num.append(num[i-2]+num[i-1])
print(num[n-1] % 1000000007)