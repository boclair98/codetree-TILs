word = input()
dic = {} 
for i in word:
    if i not in dic:
        dic[i] = 1
    else:
        dic[i] +=1 

cnt = 0 
for i in dic:
    if dic[i] == 1:
        print(i)
        break
    else:
        cnt+=1 
else:
    if cnt > 0:
        print('None')