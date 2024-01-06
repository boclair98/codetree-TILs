word = input()
word2 = input()
tal = 0 
for i in range(len(word)-1):
    cnt = 0 
    for j in range(len(word2)):

        if word[i+j] == word2[j]:
            cnt+=1
    if cnt == 2:
        tal+=1
print(tal)