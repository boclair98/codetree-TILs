word1, word2 = map(str,input().split())
tal = ""
tal2 = ""
for i in word1:
    if int(i)>=0 and int(i)<=9:
        tal+=i
for i in word1:
    if int(i)>=0 and int(i)<=9:
        tal2+=i
tal3 = int(tal) + int(tal2)
print(tal3)