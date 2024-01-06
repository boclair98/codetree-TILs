word = input()
word2 = input()
w = len(word2)
cnt = -2
for i in range(len(word)):
    if word[i:i+w] == word2:
        cnt=i
        break
if cnt>=0:
    print(cnt)
else:
    print(-1)