n = int(input())

num = list(map(int,input().split()))

def jal(num):

    for i in range(n):
        if num[i] %2 == 0:
            num[i]= num[i]//2

jal(num)

for i in range(n):
    print(num[i],end=' ')