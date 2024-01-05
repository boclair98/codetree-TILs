n = int(input())
word = [] 
for i in range(n):
    word.append(input())
word2 = input()
cnt = 0 
tal = 0 
for i in range(n):
    if word[i][0] == word2:
        cnt+=1
        tal = len(word[i]) + tal
print(f"{cnt} {tal/cnt:.2f}")