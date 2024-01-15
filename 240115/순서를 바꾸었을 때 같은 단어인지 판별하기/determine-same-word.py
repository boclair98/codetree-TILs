word = list(map(str,input()))
word2 = list(map(str,input()))

word.sort()
word2.sort()

if word == word2:
    print("Yes")
else:
    print("No")