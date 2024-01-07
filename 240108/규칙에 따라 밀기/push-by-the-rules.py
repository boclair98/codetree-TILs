word = input()

word2 = input()
word2l = len(word)
for i in word2:
    if i =='L':
        word = word[1:]+word[0]
    elif i =='R':
        word = word[-1]+ word[0:word2l-1] 
print(word)