import sys
ins = sys.maxsize
n  = int(input())

num = []

for _ in range(n):
    num.append(int(input()))

for i in range(n):
    val = 0
    for j in range(n):

        dist = (j+n - i) % n
        val +=dist*num[j]
    ins = min(ins,val)
print(ins)