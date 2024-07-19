from collections import deque 
n = int(input())
num = deque() 

for _ in range(n):
    sr = input().split() 
    s = sr[0]
    if sr[0]=='push_front':
        num.appendleft(int(sr[1]))
    elif s == 'push_back':
        num.append(int(sr[1]))
    elif s == 'pop_front':
        print(num.popleft())
    elif s =='pop_back':
        print(num.pop())
    elif s =='size':
        print(len(num))
    elif s =='empty':
        if len(num) == 0:
            print(1)
        else:
            print(0)
    elif s =='front':
        print(num[0])
    else:
        print(num[-1])