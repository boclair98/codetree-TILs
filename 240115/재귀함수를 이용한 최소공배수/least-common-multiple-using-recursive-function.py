n = int(input())
arr = list(map(int, input().split()))
tal = max(arr)
val = len(arr)
cnt = 0

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

def find_lcm(num):
    global tal
    global cnt
    
    if num < 0:
        return tal
    
    tal = lcm(tal, arr[num])
    return find_lcm(num - 1)

result = find_lcm(val - 1)
print(result)