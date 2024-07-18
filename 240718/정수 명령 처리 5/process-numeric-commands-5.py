n = int(input())
num = []
for _ in range(n):
    s = input().split()
    if s[0] == 'push_back':
        num.append(s[1])
    elif s[0] == 'pop_back':
        num.pop()
    elif s[0] =='size':
        print(len(num))
    else:
        print(num[int(s[1])-1])