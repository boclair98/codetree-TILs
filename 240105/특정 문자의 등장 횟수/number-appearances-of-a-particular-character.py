word = input()
cnta =0
cntb=0
for i in range(1,len(word)):
    if word[i-1]=='e' and word[i] =='e':
        cnta+=1
    elif word[i-1]=='e' and word[i]=='b':
        cntb+=1
print(cnta,cntb)