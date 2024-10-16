word,ix = input().split() 


idx = -1 
for i in range(len(word)):
    if (word[i]==ix):
        idx = i
        break
    

if idx>=0:
    print(idx)
else:
    print("No")