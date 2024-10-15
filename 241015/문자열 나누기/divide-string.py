a = int(input())
number = list(map(str,input().split()))
numbers =""
for i in number:
    numbers+=i

for i in range(1,len(numbers)+1):
    print(numbers[i-1],end='')
    if i%5 == 0:
        print()