word = list(input())
n = len(word)
cnt = 0 
for i in range(n-1):

    for j in range(i+1,n-1):

        if word[i]=="(" and word[i+1]=="(" and word[j]==')'and word[j+1] ==")":
            cnt+=1
print(cnt)