word = []
for i in range(10):
    word.append(input())

word2 = input()
cnt = 0 
for i in range(10):
    if word[i][-1]==word2:
        cnt+=1
        print(word[i])
if cnt == 0:
    print("None")