word ,a  = map(str,input().split())
cnt = -1
for i in range(len(word)):
    if word[i] == a:
        cnt = i 
        break;
if cnt>=0:
    print(cnt)
else:
    print("No")