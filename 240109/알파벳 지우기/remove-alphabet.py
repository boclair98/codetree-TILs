word = input()

word2 = input()

tal = ""

tal2 = ""

for i in word:
    if i>='0' and i<='9':
        tal+=i

for i in word2:
    if i>='0' and i<='9':
        tal2+=i

print(int(tal)+int(tal2))