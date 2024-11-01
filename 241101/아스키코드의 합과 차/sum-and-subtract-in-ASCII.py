word1,word2 = input().split()

print(ord(word1) + ord(word2),end=' ')

if(ord(word1)>ord(word2)):
    print(ord(word1) - ord(word2))
else:
    print(ord(word2) - ord(word1))