word = input()
tal = 1
val = 0
wording = "" 

for i in range(1,len(word)):
   

    if word[i-1] == word[i]:
        tal+=1
    else:
        wording+=word[i-1]
        wording+=str(tal)
        tal = 1
wording+=word[-1]
wording+=str(tal)
print(len(wording))
print(wording)