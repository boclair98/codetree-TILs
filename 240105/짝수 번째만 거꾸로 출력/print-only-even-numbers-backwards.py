word = input()[::-1]

for i in range(len(word)):
    if i%2 == 0:
        print(word[i],end="")