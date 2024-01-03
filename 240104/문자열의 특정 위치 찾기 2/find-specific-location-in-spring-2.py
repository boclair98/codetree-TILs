word = input()
word2 = ["apple","banana","grape","blueberry","orange"]
cnt = 0 ;
for i in word2:
    if i[2]== word or i[3] ==word:
        cnt+=1
        print(i)
print(cnt)