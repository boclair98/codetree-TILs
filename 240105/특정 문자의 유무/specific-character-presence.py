word = input()
cnt = 0 
for i in range(1,len(word)):
    if word[i]=='e' and word[i-1]=='e':
        cnt+=1
if cnt>0:
    print('Yes',end=" ")
else:
    print("No",end=" ")

cnt2 = 0 
for i in range(1,len(word)):
    if word[i]=='a' and word[i-1]=='b':
        cnt2+=1
if cnt2>0:
    print('Yes',end=" ")
else:
    print("No",end=" ")