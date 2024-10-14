word = input()
cnt = 0
now =word[0]
now2 =""
for i in range(len(word)):
    if word[i] == now:
        cnt+=1
    else:
        now2+=word[i-1]
        now2+=str(cnt) 
        now = word[i]
        cnt = 1
now2+=word[-1]
now2+=str(cnt)
print(len(now2))
print(now2)