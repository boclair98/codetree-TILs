from collections import deque 
n,k = map(int,input().split())

num = deque([i for i in range(1,n+1)])

while len(num) > 1:

    for _ in range(k):
        num.append(num.popleft())
    print(num.pop(),end=' ')
print(num.pop())