word1, word2 = map(str,input().split())
tal = ""
tal2 = ""
for i in word1:
    if i>='0' and i<='9':
        tal+=i
    else:
        break
for i in word2:
    if i>='0' and i<='9':
        tal2+=i
    else:
        break
tal3 = int(tal) + int(tal2)
print(tal3)