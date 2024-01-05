n = int(input())
word = []
val =  0
tal = 0 
for i in range(n):
    word.append(input())
    tal = len(word[i]) + tal
    if word[i][0] =='a':
        val+=1
print(tal,val)