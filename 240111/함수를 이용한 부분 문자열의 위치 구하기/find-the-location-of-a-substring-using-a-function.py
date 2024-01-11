word = input()

word2 = input()

def ind(word,word2):
    cnt = 0 
    for i in range(len(word)-len(word2)+1):
        cnt = 0 
        for j in range(len(word2)):
            if word[i+j] == word[j]:
                cnt+=1 
        if cnt == len(word2):
            return i
    return - 1

print(ind(word,word2))