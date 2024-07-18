from collections import deque
n = int(input())

li = deque()

for _ in range(n):
    sr = input().split() 
    if sr[0] =='push_front':
        li.appendleft(int(sr[1]))
    elif sr[0] =='push_back':
        li.append(int(sr[1]))
    elif sr[0] =='pop_front':
        print(li.popleft())
    elif sr[0]=='pop_back':
        print(li.pop())
    elif sr[0]=='size':
        print(len(li))
    elif sr[0]=='empty':
        if len(li) == 0:
            print(1)
        else:
            print(0)
    elif sr[0] =='front':
        print(li[0])
    else:
        print(li[-1])