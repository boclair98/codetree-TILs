a,b = map(int,input().split())
tal =""
print(f"{a//b}.",end='')
a = a % b

for _ in range(20):
    a = a * 10
    print(a//b,end='')
    a = a % b