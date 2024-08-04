n = int(input())
num = [0,0,1]
for i in range(2,n):
    num.append(num[i-2]+num[i-1])
print(num[n] % 10007)