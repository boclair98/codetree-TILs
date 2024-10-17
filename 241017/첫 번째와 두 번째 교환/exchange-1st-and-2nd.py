s = input()
word1 = s[0]
word2 = s[1]
for i in s:
    if(i==word1):
        print(word2,end='')
    elif (i == word2):
        print(word1,end='')
    else:
        print(i,end='')