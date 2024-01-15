n = int(input())

num = list(map(int,input().split()))

word = []

for i in range(n):
    word.append(num[i])
    
    if i % 2 == 0:
        word.sort()
        print(word[i//2 ],end=' ')