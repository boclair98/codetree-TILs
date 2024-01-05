word = input()
tal = 1
val = 0 
for i in range(1,len(word)):
    if word[i-1] != word[i] and word[i] !=word[i+1]:
        pass
    else:
        val+=1
print(val)
for i in range(1,len(word)):
   

    if word[i-1] == word[i]:
        tal+=1
    else:
        print(word[i-1]+str(tal),end="")
        tal = 1
print(word[-1]+str(tal))