from collections import deque 
n = deque()
t = int(input())
for _ in range(t):
    s = input().split()
    if s[0] == 'push':
        n.append(int(s[1]))
    elif s[0] =='pop':
        print(n.popleft())
    elif s[0]=='size':
        print(len(n))
    elif s[0]=='empty':
        if len(n) == 0:
            print(1)
        else:
            print(0)
    elif s[0]=='front':
        print(n[0])