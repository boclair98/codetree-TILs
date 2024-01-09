word = input() 
word2 = input()
cnt = 0
tot = False
for i in range(len(word)):
    word = word[1:]+word[0]
    cnt+=1
    if word == word2:
        tot = True
        break
if tot:
    print(cnt)
else:
    print(-1)