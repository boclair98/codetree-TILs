word = input()
word2 = input()
w = len(word2)
cnt = 0
for i in range(len(word)):
    if word[i:i+w] == word2:
        cnt+=i
        break
if cnt>-1:
    print(cnt)
else:
    print(-1)