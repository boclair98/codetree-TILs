word = input()
word2 =input()
len_word = len(word)
len_word2 = len(word2)
cnt = 0 
for i in range(len(word)):
    if word[i:len_word2+i] == word2:
        cnt+=1
print(cnt)