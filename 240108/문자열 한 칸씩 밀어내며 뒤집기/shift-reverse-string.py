word , n = map(str,input().split())
n = int(n)

for i in range(n):
    num = int(input())
    if num == 1:
        word = word[1:] + word[0]
        print(word)
    elif num == 2:
        word=word[-1]+ word[0:len(word)-1]
        print(word)
    elif num == 3:
        word = word[::-1]
        print(word)