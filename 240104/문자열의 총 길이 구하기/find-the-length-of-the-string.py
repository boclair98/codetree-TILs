word = input().split()
tal = 0
for word_len in word:
    tal = tal + len(word_len)
print(tal)