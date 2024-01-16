import math
n = int(input())
def circle(x,y):
    return abs(x) + abs(y)


word = []

for i in range(n):
    x,y = map(int,input().split())
    word.append((circle(x,y),i+1))

word.sort()

for i,idx in word:
    print(idx)